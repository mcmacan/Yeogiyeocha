package org.example.aop;

//import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
//@Slf4j
@Component
@Aspect
public class LogAspect {

    //Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Around("execution(* org.example..*(..))")
    //@Around("@annotation(LogExecutionTime)")
    //포인트 컷 작성
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
        /*StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object proceed = joinPoint.proceed();

        stopWatch.stop();
        logger.info(stopWatch.prettyPrint());

        return proceed;*/
        long start = System.currentTimeMillis();
        //시간 측정

        System.out.println("Start: "+joinPoint.toString());
        try {
            return joinPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint.toString() + " " + timeMs+"MS");
        }
    }
}
