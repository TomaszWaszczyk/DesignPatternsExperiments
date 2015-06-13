package com.waszczyk.headfirst.chapter1;

/**
 * Created by Mr Phi on 2015-06-13.
 */
public abstract class Kaczka {

    KwakanieInterfejs kwakanieInterfejs;
    LatanieInterfejs latanieInterfejs;

    public void wykoanjKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void plywaj() {
        System.out.println("Plywaj");
    }

    public void wykonajLatanie() {
        latanieInterfejs.lec();
    }

    abstract void wyswietl();
}
