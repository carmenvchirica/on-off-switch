package ch.springframework.onoff;

public class LightBulb implements Switchable  {

	@Override
	public void setOn() {
		System.out.println("LightBulb ON");
		
	}

	@Override
	public void setOff() {
		System.out.println("LightBulb OFF");
	}

	

}
