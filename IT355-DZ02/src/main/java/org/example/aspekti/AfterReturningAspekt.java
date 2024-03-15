@Aspect
public class AfterReturningAspect {
    @AfterReturning("execution(* org.example.services..prikaziPodatke(..))")
    public void aftrRiturning(JoinPoint joinPoint){
        System.out.println("Posle vracanja " +joinPoint.toString());
    }

}