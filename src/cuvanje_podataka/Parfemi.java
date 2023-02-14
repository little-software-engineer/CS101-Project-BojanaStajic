/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuvanje_podataka;

import java.util.List;
import java.util.Scanner;
import obrada_podataka.Cena;
import obrada_podataka.Korpa;

/**
 *
 * @author PC
 */
public class Parfemi extends Proizvodi {

    private String ime;

    public Parfemi() {
    }

    public Parfemi(String ime, boolean dostupnost, double cena, int brojNaStanju, double militraza) {
        super(dostupnost, cena, brojNaStanju, militraza);
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Proizvodi> getProizvodi() {
        return proizvodi;
    }

    @Override
    public void setProizvodi(List<Proizvodi> proizvodi) {
        this.proizvodi = proizvodi;
    }

    @Override
    public void listaProizvod() {
        Parfemi p = new Parfemi(ime, true, 0, 0, 0);
        this.proizvodi.add(p);
    }

    @Override
    public String toString() {
        return "Ime parfema: " + this.ime + "\n" + "Broj parfema na stanju: " + this.getBrojNaStanju() + "\n" + "Cena u dinarima: " + this.getCena() + "\n" + "Militraža: " + this.getMilitraza();

    }

}
