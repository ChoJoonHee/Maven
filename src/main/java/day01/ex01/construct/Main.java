package day01.ex01.construct;

import org.springframework.context.support.GenericXmlApplicationContext;

import day01.ex02.setter.DatabaseDev;
import day01.ex02.setter.MemberDAO;
import day01.ex03.toy.ApToy;
import day01.ex03.toy.CarToy;

public class Main {
	public static void main(String args[]) {
		//hotel의 생성자의 매개변수가 chef이므로 chef를 생성해서 넣어줌
		//Hotel hotel = new Hotel(new Chef());
		
		//hotel.getChef().cook();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		Hotel h = ctx.getBean("hotel", Hotel.class);
		h.getChef().cook();
		
		Restaurant res = ctx.getBean("restaurant", Restaurant.class );
		res.getChef().rest_Cook();
		DatabaseDev dv = ctx.getBean("DBDev2", DatabaseDev.class );
		DatabaseDev dv1 = ctx.getBean("DBDev", DatabaseDev.class );
		
		System.out.println(dv.getUid());
		System.out.println(dv.getUrl());
		System.out.println(dv.getUpw());
		
		System.out.println(dv1.getUid());
		System.out.println(dv1.getUrl());
		System.out.println(dv1.getUpw());
		
		System.out.println("------------------------");
		MemberDAO dao = ctx.getBean("ds", MemberDAO.class);
	
		dao.info();
	
	/*--------------------------------------------------------------------------------------------*/
		
		ApToy airplane = ctx.getBean("Apt", ApToy.class);
		CarToy car = ctx.getBean("Ct", CarToy.class);
		
		airplane.botton();
		car.botton();
	
		
	
		


		
	}
}
