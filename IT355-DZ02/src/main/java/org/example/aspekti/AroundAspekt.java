@Aspect
public class AroundAspect {

    @Around("execution(* org.example.services..prikaziPodatke(..))")
    public Object araund(ProceedingJoinPoint proceedingJoinPoint){
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("Around Aspect");
        return value;
    }
}