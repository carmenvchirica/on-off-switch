package ch.springframework.onoff;

public class ElectricPowerSwitch implements Switch{
	
	public Switchable switchable;
	public boolean on;
	
	public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
        this.on = false;
    }
	
	@Override
	public boolean isOn() {
		return on;
	}
	@Override
	public void press() {
		   boolean checkOn = isOn();
	       if (checkOn) {
	    	   switchable.setOff();
	           this.on = false;
	       } else {
	    	   switchable.setOn();
	           this.on = true;
	       }
	}
	

}
