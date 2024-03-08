package org.example.servisi;

import org.example.interfejs.Oblik;
import org.example.interfejs.OblikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KrugService implements OblikService {
    private Oblik krug;

    @Autowired
    public KrugService(Oblik krug) {
        this.krug = krug;
    }
    @Override
    public void prikaziPodatke() {
        System.out.println("Krug - Obim: " + krug.obim() + ", Povrsina: " + krug.povrsina());
    }
}
