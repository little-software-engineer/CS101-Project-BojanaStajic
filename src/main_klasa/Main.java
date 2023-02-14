/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_klasa;

import fajlovi.Datoteke;
import java.util.List;
import java.util.Scanner;
import obrada_podataka.*;
import cuvanje_podataka.Korisnik;
import cuvanje_podataka.Login;
import cuvanje_podataka.Proizvodi;
import cuvanje_podataka.Parfemi;
import cuvanje_podataka.TipKorisnika;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        Login l = new Login();
        l.UcitajKorisnika();
        System.out.println("Vaši podaci(zarad potvrde da ste sve uneli kako treba): " + l.toString());
        System.out.println("Uspešno ste zavrsili proces registracije na naš sajt!");
        TipKorisnika tk = TipKorisnika.vip;
        System.out.println("Vi ste naš" + " " + tk + " " + "tip korisnika!");
        System.out.println("\n");

        Parfemi p = new Parfemi("Dior Sauvage", true, 3574.3, 10, 100.0);
        Parfemi p2 = new Parfemi("Chanel Gabrielle", true, 4785.2, 8, 78.5);
        Parfemi p3 = new Parfemi("Bulgari The Roman Night", true, 7896.7, 6, 100.0);
        p.listaProizvod();
        p2.listaProizvod();
        p3.listaProizvod();
        System.out.println("Dostupni proizvodi: ");
        System.out.println(p.toString() + "\n");
        System.out.println(p2.toString() + "\n");
        System.out.println(p3.toString() + "\n");

        Korpa k1 = new Korpa();
        k1.toString();
        System.out.println("Unesite količinu proizvoda koji želite da kupite");
        p.racunajCenu(); //za odabrani proizvod koji kao što vidimo dole je p
        k1.Kupi(p);

        Datoteke.upisivanjeLogin(l);
        Datoteke.upisivanjeParfem(p);
    }

}
