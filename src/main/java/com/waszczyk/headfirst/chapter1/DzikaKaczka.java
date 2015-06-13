package com.waszczyk.headfirst.chapter1;

/**
 * Created by Mr Phi on 2015-06-13.
 */
public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }
    void wyswietl() {
        System.out.println("Wyswietl Dzika Kaczka");
    }

}