/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuvanje_podataka;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Login extends Korisnik {

    private static String username;
    private static String sifra;

    public Login() {
    }

    public Login(String username, String sifra, String ime, String prezime, int godinaRodjenja, String brojTelefona, String email) {
        super(ime, prezime, godinaRodjenja, brojTelefona, email);
        this.username = username;
        this.sifra = sifra;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Login.username = username;
    }

    public static String getSifra() {
        return sifra;
    }

    public static void setSifra(String šifra) {
        Login.sifra = šifra;
    }

    @Override
    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

    @Override
    public void setKorisnici(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    @Override
    public void UcitajKorisnika() {
        Scanner sc = new Scanner(System.in);
        Login l = new Login();
        System.out.println("Dobrodosli u online parfimeriju! Molimo unesite sledece podatke: ");
        System.out.print("Vaše ime: ");
        l.setIme(sc.next());
        System.out.print("Vaše prezime: ");
        l.setPrezime(sc.next());
        System.out.print("Godina rođenja: ");
        l.setGodinaRodjenja(sc.nextInt());
        System.out.print("Vaš broj telefona: ");
        l.setBrojTelefona(sc.next());
        System.out.print("Vaša email adresa: ");
        l.setEmail(sc.next());
        this.korisnici.add(l);
        System.out.println("\n");
        System.out.println("Uspešno ste se sign-upovali na naš online shop!");

        System.out.println("\n");
        System.out.println("Molimo popunite log-in podatke: ");
        System.out.println("Vaš username: ");
        l.setUsername(sc.next());
        System.out.println("Vaša šifra: ");
        l.setSifra(sc.next());
        System.out.println("Uspešno ste završili log-in na našem online shop-u! ");
    }

    @Override
    public String toString() {
        return "Ime: " + Korisnik.getIme() + "\n" + "Prezime: " + Korisnik.getPrezime() + "\n" + "Godina rođenja: " + Korisnik.getGodinaRodjenja() + "\n" + "Broj telefona: " + Korisnik.getBrojTelefona() + "\n" + "Email adresa: " + Korisnik.getEmail() + "\n" + "Username: " + Login.getUsername() + "\n" + "Šifra: " + Login.getSifra();

    }

}
