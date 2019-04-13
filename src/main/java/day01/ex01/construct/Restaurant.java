package day01.ex01.construct;

public class Restaurant {

	private Chef chef;
	
	public Restaurant(Chef chef) {
		this.chef = chef; 
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
}
