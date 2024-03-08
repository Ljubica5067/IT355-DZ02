package org.example.servisi;

import org.example.interfejs.Oblik;
import org.example.interfejs.OblikService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class JednakostranicniTrougaoService implements OblikService {
    private Oblik trougao;

    @Autowired
    public JednakostranicniTrougaoService(Oblik trougao) {
        this.trougao = trougao;
    }
    @Override
    public void prikaziPodatke() {
        System.out.println("Jednakostranicni Trougao - Obim: " + trougao.obim() + ", Povrsina: " + trougao.povrsina());
    }
}
