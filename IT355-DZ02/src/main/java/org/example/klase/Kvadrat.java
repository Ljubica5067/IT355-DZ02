package org.example.klase;

import org.example.interfejs.Oblik;

public class Kvadrat implements Oblik {
    private double a;

    public Kvadrat(double a) {
        this.a = a;
    }

    @Override
    public double obim() {
        if (a <= 0) {
            throw new IllegalArgumentException("Vrednost mora biti veca od 0");
        }
        return 4 * a;
    }

    @Override
    public double povrsina() {
        if (a <= 0) {
            throw new IllegalArgumentException("Vrednost mora biti veca od 0");
        }return a * a;
    }
}
