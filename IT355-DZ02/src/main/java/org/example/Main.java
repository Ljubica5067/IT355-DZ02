package org.example;

import org.example.interfejs.OblikService;
import org.example.servisi.JednakostranicniTrougaoService;
import org.example.servisi.KrugService;
import org.example.servisi.KvadratService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OblikService kvadratService = context.getBean(KvadratService.class);
        OblikService krugService = context.getBean(KrugService.class);
        OblikService jednakostranicniTrougaoService = context.getBean(JednakostranicniTrougaoService.class);

        kvadratService.prikaziPodatke();
        krugService.prikaziPodatke();
        jednakostranicniTrougaoService.prikaziPodatke();
    }
}