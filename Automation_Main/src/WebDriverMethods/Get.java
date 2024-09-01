package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//to get the title
			String actual_title = driver.getTitle();
			String expected_title = "Facebook – log in or sign up";
			
			if(actual_title.equals(expected_title))
				System.out.println("Login page is displayed");
			else
				System.out.println("Login page is not displayed");
	}

}
