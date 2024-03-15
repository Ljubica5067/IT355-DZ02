package org.example.klase;

import org.example.interfejs.Oblik;

public class JednakostranicniTrougao implements Oblik {


    private double a;

    public JednakostranicniTrougao(double a) {
        this.a = a;
    }

    @Override
    public double obim() {

        if (a <= 0) {
            throw new IllegalArgumentException("Vrednost mora biti veca od 0");
        }return 3*a;
    }

    @Override
    public double povrsina() {

        if (a <= 0) {
            throw new IllegalArgumentException("Vrednost mora biti veca od 0");
        }return (Math.sqrt(3) / 4) * Math.pow(a, 2);
    }
}
