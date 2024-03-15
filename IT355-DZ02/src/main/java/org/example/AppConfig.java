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

@EnableAspectJAutoProxy
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

    @Bean
    public BeforeAspekt aspekti() {
        return new BeforeAspekt();
    }
    @Bean
    public AfterAspekt askept2(){
        return new AfterAspekt();
    }
    @Bean
    public AfterReturningAspekt askept3(){
        return new AfterReturningAspekt();
    }

    @Bean
    public AfterThrowingAspekt askept4(){
        return new AfterThrowingAspekt();
    }
    @Bean
    public AroundAspekt askept5(){
        return new AroundAspekt();
    }
}
