package ch.springframework.onoff;

public class AC implements Switchable {

	@Override
	public void setOn() {
		System.out.println("AC ON");
		
	}

	@Override
	public void setOff() {
		System.out.println("AC OFF");
	}

}
