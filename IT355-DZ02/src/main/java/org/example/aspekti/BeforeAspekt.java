@Aspect
public class BeforeAspect {
    @Before("execution(* org.example.servisi..prikaziPodatke(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Pre izvrsavanje metode " + joinPoint.toString());
    }
}