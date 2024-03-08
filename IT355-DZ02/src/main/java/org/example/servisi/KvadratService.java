package org.example.servisi;

import org.example.interfejs.Oblik;
import org.example.interfejs.OblikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KvadratService implements OblikService {
    private Oblik kvadrat;

    @Autowired
    public KvadratService(Oblik kvadrat) {
        this.kvadrat = kvadrat;
    }
    @Override
    public void prikaziPodatke() {
        System.out.println("Kvadrat - Obim: " + kvadrat.obim() + ", Povrsina: " + kvadrat.povrsina());
    }
}
