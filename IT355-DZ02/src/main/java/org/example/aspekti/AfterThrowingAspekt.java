@Aspect
public class AfterThrowingAspect {
    @AfterThrowing("within(org.example.services.JednakostranicniTrougaoService)")
    public void aftrTrouing(JoinPoint joinPoint){
        System.out.println("Posle izbacivanja greske " +joinPoint.toString());
    }
}