package day01.ex05.autowired;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Printer2 {
	/*
	 * @Resource는 -> 자동주입이름 객체의 이름으로 사용,일치하는 이름 없을시 타입으로 찾음
	 * 속성과 메서드에 사용가능
	 */
	@Resource(name="docu2")
	@Qualifier("docu2")
	private Document2 doc;

	//생성자
	public Printer2(Document2 doc) {
		this.doc = doc;
	}

	public Document2 getDoc() {
		return doc;
	}

	public void setDoc(Document2 doc) {
		this.doc = doc;
	}
	

	

	
	
}
