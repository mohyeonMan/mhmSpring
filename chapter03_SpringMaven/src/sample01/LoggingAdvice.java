package sample01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//공통코드
//advice
@Aspect
@Component
public class LoggingAdvice {
	
	@Before("execution(public void sample01.MessageBeanImpl.*Before())")
	public void beforeTrace() {
		System.out.println("before trace");
	}
	@After("execution(public * *.*.*After())")
	public void afterTrace() {
		System.out.println("after trace");
	}
	@Around("execution(public * *.*.*Print())")
	public void trace(ProceedingJoinPoint joinPoint) throws Throwable {
		//앞에 삽입될코드
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("메소드 = "+ methodName);
		
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		//핵심코드 호출
		Object ob = joinPoint.proceed(); 
		System.out.println("return = "+ob);
		//뒤에 삽입될코드
		sw.stop();
		System.out.println("처리 시간 = "+ sw.getTotalTimeMillis()/1000+"초");
	}	
}
