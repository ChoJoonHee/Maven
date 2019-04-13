package day01.ex03.toy;

public class ApToy {

	private InterBattery battery;
	
	//배터리 일체형이라서 객체생성될때 배터리를 넣음
	
	public ApToy(InterBattery battery) {
		this.battery = battery;
	}
	
	//배터리 보기 기능
	public void botton() {
		battery.energy();
	}
}
