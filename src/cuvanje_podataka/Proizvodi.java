/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuvanje_podataka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import obrada_podataka.Cena;
import obrada_podataka.Korpa;

/**
 *
 * @author PC
 */
public abstract class Proizvodi implements Cena {

    private boolean dostupnost;
    private double cena;
    private int brojNaStanju;
    private double militraza;
    List<Proizvodi> proizvodi = new ArrayList<Proizvodi>();

    protected Proizvodi() {
    }

    protected Proizvodi(boolean dostupnost, double cena, int brojNaStanju, double militraza) {
        this.dostupnost = dostupnost;
        this.cena = cena;
        this.brojNaStanju = brojNaStanju;
        this.militraza = militraza;
    }

    public boolean isDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(boolean dostupnost) {
        this.dostupnost = dostupnost;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getBrojNaStanju() {
        return brojNaStanju;
    }

    public void setBrojNaStanju(int brojNaStanju) {
        this.brojNaStanju = brojNaStanju;
    }

    public double getMilitraza() {
        return militraza;
    }

    public void setMilitraza(double militraza) {
        this.militraza = militraza;
    }

    public List<Proizvodi> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvodi> proizvodi) {
        this.proizvodi = proizvodi;
    }

    public abstract void listaProizvod();

    @Override
    public double racunajCenu() {
        Korpa k1 = new Korpa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj parfema koji želite kupiti(količinski)!");
        int brojZakupiti = sc.nextInt();
        double ukupnaCena = (brojZakupiti * this.cena);
        System.out.println("Ukupna cena u vašoj korpi je: " + ukupnaCena + " " + "dinara");
        return ukupnaCena;
    }

    @Override
    public String toString() {
        return "Dostupnost proizvoda: " + this.dostupnost + "\n" + "Cena proizvoda: " + this.cena + "\n" + "Broj proizvoda koji imamo na stanju: " + this.brojNaStanju + "\n" + "Militraža: " + this.militraza;

    }

}
