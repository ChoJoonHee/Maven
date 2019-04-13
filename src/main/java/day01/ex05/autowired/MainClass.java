package day01.ex05.autowired;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("autowiredctx.xml");
		Printer p = ctx.getBean(Printer.class);
	    System.out.println(p.getDoc().data[0]);
	    
	    Printer2 p2 = ctx.getBean("printer2", Printer2.class);
	    
	    System.out.println(p2.getDoc().data[3]);
	}
}
