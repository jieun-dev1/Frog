package aop002;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;

//POJO&XML 기반 - 스프링 프레임워크에 종속되지 않음.
//@Aspect
public class MyAspect {
//    @Before("execution(* runSomething ())") //Aspect 적용위치 지정자. PointCut
    public void before(JoinPoint joinPoint) { //횡단 관심사를 실행. runSomething이 실행되기 전.
        System.out.println("얼굴 인식 확인: 문을 개방하라");
    }
}
