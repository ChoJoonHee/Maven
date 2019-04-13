package day01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String args[])
	{
		
		//xml에 설정되어있는 bean객체를 IOC컨테이너에 넣어서 관리.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		Object good = ctx.getBean("good");
	
		//	SpringTest st = (SpringTest)good;
		//	st.test();
		SpringTest st = ctx.getBean("good", SpringTest.class);
		st.test();
	}
}
