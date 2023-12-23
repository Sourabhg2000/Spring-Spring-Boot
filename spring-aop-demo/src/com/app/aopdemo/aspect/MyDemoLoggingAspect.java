package com.app.aopdemo.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	/*
	 * @Before("execution(public void com.app.aopdemo.dao.AccountDAO
	 * .addAccount())")
	 * public void beforeAddAccountAdvice() {
	 * System.out.println("Executing @Before advice on addAccount()"); }
	 */
	
	/*
	 * //Match method starting with add in any class
	 * 
	 * @Before("execution(public void add*())") 
	 * public void beforeAddAccountAdvice()
	 * { 
	 * System.out.println("Executing @Before advice on addAccount()");
	 * }
	 */
	
	//@Before("execution(* * methodName())")
	
	//
	
	
	  @Before("execution(public * doWork(..))") 
	  public void beforeAddAccountAdvice() {
	  System.out.println("Executing @Before advice on doWork()"); }
}
