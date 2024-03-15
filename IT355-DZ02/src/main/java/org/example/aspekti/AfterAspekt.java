-------------
@Aspect
public class AfterAspect {
    @After("execution(* org.example.services..prikaziPodatke(..))")
    public void aftr(JoinPoint joinPoint){
        System.out.println("Posle izvrsavanje metode " +joinPoint.toString());
    }
}