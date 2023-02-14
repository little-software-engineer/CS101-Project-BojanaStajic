/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_podataka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cuvanje_podataka.Parfemi;
import cuvanje_podataka.Proizvodi;

/**
 *
 * @author PC
 */
public class Korpa extends Proizvodi {

    private int brojProizvoda;
    private String kupi = "Da";

    public Korpa() {
    }

    public Korpa(int brojProizvoda) {
        this.brojProizvoda = brojProizvoda;
    }

    public Korpa(int brojProizvoda, boolean dostupnost, double cena, int brojNaStanju, double militraza) {
        super(dostupnost, cena, brojNaStanju, militraza);
        this.brojProizvoda = brojProizvoda;
    }

    public int getBrojProizvoda() {
        return brojProizvoda;
    }

    public void setBrojProizvoda(int brojProizvoda) {
        this.brojProizvoda = brojProizvoda;
    }

    public String getKupi() {
        return kupi;
    }

    public void setKupi(String kupi) {
        this.kupi = kupi;
    }

    @Override
    public void listaProizvod() {
        List<Korpa> korpa = new ArrayList<Korpa>();
        Korpa k = new Korpa();
        k.setBrojProizvoda(brojProizvoda);
        korpa.add(k);

    }

    /**
     *
     * @param p
     */
    public void Kupi(Parfemi p) {
        Scanner fc = new Scanner(System.in);
        System.out.println("Da li želite da kupite ono što vam je u korpi? (Da/Ne)");
        kupi = fc.next();
        if (kupi.startsWith("Da")) {
            System.out.println("Uspešno ste kupili naše proizvode! Hvala na kupovini!");
        } else {
            System.out.println("Niste kupili proizvode iz vaše korpe,možete im se vratiti kad god želite radi finlizacije kupovine!");
        }
    }

    @Override
    public String toString() {

        return "Podaci o korpi: " + "\n" + "Broj proizvoda u vašoj korpi je: " + this.brojProizvoda;
    }

}
