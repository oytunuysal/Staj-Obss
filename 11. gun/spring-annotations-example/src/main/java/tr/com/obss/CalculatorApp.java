package tr.com.obss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ComponentScan(basePackages = "tr.com.obss")
public class CalculatorApp {
	public static void main(String args[]) // static method
	{
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CalculatorAppConfig.class);
		PrimarySchoolCalcUtil pscu=(PrimarySchoolCalcUtil) appContext.getBean(PrimarySchoolCalcUtil.class);
		System.out.println(pscu.add(2, 4));
		pscu.add(2, 4);
	}
	
	
}
