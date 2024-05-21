package stepDefination;

 

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import testbase.TestBase;

public class Hooks extends TestBase {
	@AfterStep(order=1)
	public void setScreenShot(Scenario scenario) {
		if(scenario.isFailed()) {
		final  byte[] screenshort=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshort, "image/png", scenario.getName());
		
		}
		else {
			final  byte[] screenshort=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshort, "image/png", scenario.getName());
		}
	}
//	@AfterStep(order=0)
//	public void serTearDown() {
//		driver.close();
//	}

}
