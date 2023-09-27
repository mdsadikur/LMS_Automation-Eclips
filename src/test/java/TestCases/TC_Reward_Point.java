package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Reward_Point;
import base.DriverStudent;

public class TC_Reward_Point extends DriverStudent{
	
	@Test
	public void TC_Reward_point() throws InterruptedException {
		
		POM_Reward_Point cbox = new POM_Reward_Point(driver);
		
		//clickRewardPoint
		cbox.clickRewardPoint();
		Thread.sleep(2000);
	}

}
