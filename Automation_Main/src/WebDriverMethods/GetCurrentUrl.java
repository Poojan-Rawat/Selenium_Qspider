package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		//get CurrentUrl
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");//lanunching
		String actual_Url = driver.getCurrentUrl();
		String expected_Url = "https://www.facebook.com/";
		
		if(actual_Url.equals(expected_Url))
			System.out.println("I am getting welcome page");
		else
			System.out.println("I am not getting welcome page");
	}

}
