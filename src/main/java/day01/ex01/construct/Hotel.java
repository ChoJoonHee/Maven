package day01.ex01.construct;

public class Hotel {
	
	private Chef chef;
	//생성자--> chef변수를 바로 사용하지 못하게 생성자이용
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
}
