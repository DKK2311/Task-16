package browser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver Driver = new FirefoxDriver();
Driver.get("https://www.google.com");
//Using Edge Browser Instead of Firefox 		
WebDriver driver = new FirefoxDriver();

//Maximizing the window 
driver.manage().window().maximize(); 

//Navigating the URL
driver.navigate().to("https://www.google.com/"); 

//Using getCurrentUrl() method to get the URL
String url= driver.getCurrentUrl();            

//Printing the URL
System.out.println("The Webpage Loaded from:");   
System.out.println(url);

//Reloading the page
driver.navigate().refresh();                               

//Closing the driver
driver.close();

	}

}
