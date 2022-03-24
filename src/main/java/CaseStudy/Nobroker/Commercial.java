package CaseStudy.Nobroker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Commercial {
	public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec252\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='app']/div/div/div[1]/div[3]/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//Implicitywait
		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();

		Actions actions=new Actions(driver);
		for(int i=0;i<5;i++)
		{
		actions.sendKeys(Keys.DOWN).perform();
		}
		actions.sendKeys(Keys.ENTER).perform();
		//Actions a = new Actions(driver);
		//for(int i=0;i<1;i++) {
		//	a.sendKeys(Keys.DOWN).perform();
		//}
		//a.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Kukatpally");

		driver.findElement(By.cssSelector("div[class='autocomplete-dropdown-container']")).click();
		

		Actions actions1=new Actions(driver);
		for(int i=0;i<3;i++)
		{
		actions1.sendKeys(Keys.DOWN).perform();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
		//String headingOpage=driver.findElement(By.xpath("//div[@class='heading-5 whitespace-nowrap overflow-ellipsis overflow-hidden nb__1K1jy']")).getText();
		//System.out.println(headingOpage);
		//driver.close();
	}
}
