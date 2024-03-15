package org.example.klase;

import org.example.Main;
import org.example.interfejs.Oblik;

public class Krug implements Oblik {

    private double r;

    public Krug(double r) {
        this.r = r;
    }
    @Override
    public double obim() {
        if (r <= 0) {
            throw new IllegalArgumentException("Vrednost mora biti veca od 0");
        }return 2*r*Math.PI;
    }

    @Override
    public double povrsina() {

        if (r <= 0) {
            throw new IllegalArgumentException("Vrednost mora biti veca od 0");
        }return Math.PI*Math.pow(r,2);
    }
}
