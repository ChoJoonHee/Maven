package day01.ex05.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Printer {
	
	/*
	 * AutoWired -> 컨테이너에 객체의 타입을 찾아서 자동으로 의존성을 주입시켜주는 스프링의 어노테이션기능
	 * 				생성자, 속성값, 메서드에 모두 적용가능하다.
	 */
	
	
	private Document doc;
	
	public Document getDoc() {
		return doc;
	}
	@Autowired
	public void setDoc(Document doc) {
		this.doc = doc;
	}

	
	
}
