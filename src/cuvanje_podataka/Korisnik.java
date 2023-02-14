/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuvanje_podataka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public abstract class Korisnik {

    private static String ime;
    private static String prezime;
    private static int godinaRodjenja;
    private static String brojTelefona;
    private static String email;
    List<Korisnik> korisnici = new ArrayList<Korisnik>();

    protected Korisnik() {
    }

    protected Korisnik(String ime, String prezime, int godinaRodjenja, String brojTelefona, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.brojTelefona = brojTelefona;
        this.email = email;
    }

    public static String getIme() {
        return ime;
    }

    public static void setIme(String ime) {
        Korisnik.ime = ime;
    }

    public static String getPrezime() {
        return prezime;
    }

    public static void setPrezime(String prezime) {
        Korisnik.prezime = prezime;
    }

    public static int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public static void setGodinaRodjenja(int godinaRodjenja) {
        Korisnik.godinaRodjenja = godinaRodjenja;
    }

    public static String getBrojTelefona() {
        return brojTelefona;
    }

    public static void setBrojTelefona(String brojTelefona) {
        Korisnik.brojTelefona = brojTelefona;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Korisnik.email = email;
    }

    /**
     *
     * @return
     */
    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public abstract void UcitajKorisnika();

    @Override
    public String toString() {
        return "Ime: " + this.ime + "\n" + "Prezime: " + this.prezime + "\n" + "Godina rođenja: " + this.godinaRodjenja + "\n" + "Broj telefona: " + this.brojTelefona + "\n" + "Email adresa: " + this.email;

    }

}
