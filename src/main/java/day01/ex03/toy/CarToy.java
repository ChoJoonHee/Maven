package day01.ex03.toy;

public class CarToy {
	
	private InterBattery battery;

	
	
	public InterBattery getBattery() {
		return battery;
	}

	public void setBattery(InterBattery battery) {
		this.battery = battery;
	}
	
	public void botton() {
		battery.energy();
	}

}
