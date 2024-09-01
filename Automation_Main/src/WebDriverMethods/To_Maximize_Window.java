package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Maximize_Window {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get(
		
		
		//set dimensions
		Dimension d= new Dimension(780,780);
		driver.manage().window().setSize(d);
		
	
	}

}
