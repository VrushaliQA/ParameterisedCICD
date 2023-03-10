package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterFromMVNCommand {
	@Test
	
	public void test1_1()
	{
		WebDriver driver=null;
		//String launchBrowser="chrome";
		String launchBrowser=System.getProperty("browser");
		if(launchBrowser.equalsIgnoreCase("chrome"))
		{
			System.out.println("chrome browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(System.getProperty("url"));
		}
		else
		{
			System.out.println("other browser");
		}
	}

}
