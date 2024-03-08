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
        return 2*r*Math.PI;
    }

    @Override
    public double povrsina() {
        return Math.PI*Math.pow(r,2);
    }
}
