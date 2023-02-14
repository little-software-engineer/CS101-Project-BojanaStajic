/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlovi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import obrada_podataka.Korpa;
import cuvanje_podataka.Korisnik;
import cuvanje_podataka.Login;
import cuvanje_podataka.Parfemi;
import cuvanje_podataka.Proizvodi;
import cuvanje_podataka.TipKorisnika;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author PC
 */
public class Datoteke {

    public static List<Proizvodi> ucitajProizvode(String datoteka) {
        List<Proizvodi> proizvodi = new ArrayList<>();
        File d = new File(datoteka);

        try (Scanner sc = new Scanner(d)) {
            while (sc.hasNext()) {
                String ime = sc.next();
                boolean dostupnost = sc.nextBoolean();
                double cena = sc.nextDouble();
                int brojNaStanju = sc.nextInt();
                double tezina = sc.nextDouble();

                Parfemi p = new Parfemi(ime, dostupnost, cena, brojNaStanju, tezina);
                proizvodi.add(p);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fajl koji vam treba trenutno ne postoji.");
        }
        return proizvodi;
    }

    public static List<Korisnik> ucitajKorisnika(String datoteka) {
        List<Korisnik> korisnici = new ArrayList<>();
        File d = new File(datoteka);

        try (Scanner sc = new Scanner(d)) {
            while (sc.hasNext()) {
                String ime = sc.next();
                String prezime = sc.next();
                int godinaRodjenja = sc.nextInt();
                String brojTelefona = sc.next();
                String email = sc.next();
                TipKorisnika tipKorisnika = TipKorisnika.valueOf(sc.next());

                String username = sc.next();
                String sifra = sc.next();

                Login l = new Login(username, sifra, ime, prezime, godinaRodjenja, brojTelefona, email);
                korisnici.add(l);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fajl koji vam treba trenutno ne postoji.");
        }
        return korisnici;

    }

    public static List<Korpa> ucitajKorpu(String datoteka) {
        List<Korpa> korpa = new ArrayList<>();
        File d = new File(datoteka);

        try (Scanner sc = new Scanner(d)) {
            while (sc.hasNext()) {
                int brojProizvoda = sc.nextInt();

                Korpa k = new Korpa(brojProizvoda);
                korpa.add(k);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fajl koji vam treba trenutno ne postoji.");
        }
        return korpa;
    }

    public static void upisivanjeLogin(Object o) throws IOException {

        try {
            File f = new File("korisnik.txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print(o);
            pw.close();
            System.out.println("Objekat je uspesno zabelezen u datoteci!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void upisivanjeParfem(Object o) throws IOException {

        try {
            File f = new File("proizvodi.txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print(o);
            pw.close();
            System.out.println("Objekat je uspesno zabelezen u datoteci!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
