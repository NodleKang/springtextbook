package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// `@Aspect` 애너테이션을 보고 애스펙트 클래스라는 걸 알게됨
@Aspect
// `@Component` 애너테이션을 보고 스프링 컨테이너가 빈(Bean)으로 자동으로 등록
@Component
public class LoggingAspect {

    // @Around 애너테이션
    // : AOP의 Advice에 해당하는 부분임
    // : 메소드 실행 전후에 적용됨
    // execution(* service.*.*(..))
    // : AOP의 PointCut에 해당하는 부분으로 AspectJ 표현식으로 작성되어 있음
    // : 무슨 값을 반환하든 관계없이 service 패키지에 있는 모든 클래스의 모든 메소드가 실행(execution)될 때마다 가로챔
    @Around("execution(* service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        System.out.println("== 로깅 애스펙트 : 메소드 " + methodName + " 가 파라미터 "
                + Arrays.asList(arguments) + "를 가지고 실행됩니다.");

        Object returnedByMethod = joinPoint.proceed();

        System.out.println("== 로깅 애스펙트 : " + methodName + " 메소드가 실행되었으며, "
                + returnedByMethod + " 를 반환했습니다.");

        return returnedByMethod;
    }
}
