package day01.ex04.proto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		
		Person p1 = ctx.getBean("person", Person.class);
		Person p2 = ctx.getBean("person", Person.class);
		
		System.out.println("같은사람?" + p1.equals(p2));
	}
}
