package ch.springframework.onoff;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnOffApplicationTests {

	@Test
	void test() {
		Switchable lightBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(lightBulb);
		
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();
		
		Switchable ac = new AC();
		Switch acPowerSwitch = new ElectricPowerSwitch(ac);
		
		acPowerSwitch.press();
		acPowerSwitch.press();
		
	}

}
