package org.example;

import org.example.interfejs.Oblik;
import org.example.interfejs.OblikService;
import org.example.klase.JednakostranicniTrougao;
import org.example.klase.Krug;
import org.example.klase.Kvadrat;
import org.example.servisi.JednakostranicniTrougaoService;
import org.example.servisi.KrugService;
import org.example.servisi.KvadratService;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public OblikService kvadratService(Oblik kvadrat) {
        return new KvadratService(kvadrat);
    }
    @Bean
    public Oblik kvadrat() {
        return new Kvadrat(5);
    }
    @Bean
    public OblikService krugService(Oblik krug) {
        return new KrugService(krug);
    }

    @Bean
    public Oblik krug() {
        return new Krug(5);
    }
    @Bean
    public OblikService jednakostranicniTrougaoService(Oblik jednakostranicniTrougao) {
        return new JednakostranicniTrougaoService(jednakostranicniTrougao);
    }

    @Bean
    public Oblik jednakostranicniTrougao() {
        return new JednakostranicniTrougao(5);
    }
}
