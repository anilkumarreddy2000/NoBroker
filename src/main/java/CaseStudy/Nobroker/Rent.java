package CaseStudy.Nobroker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rent {
	public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec252\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='nb__17yFj nb__1Z-uW']")).click();

		driver.findElement(By.id("searchCity")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();

		Actions actions=new Actions(driver);
		for(int i=0;i<6;i++)
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
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions actions1=new Actions(driver);
		for(int i=0;i<2;i++)
		{
		actions1.sendKeys(Keys.DOWN).perform();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		actions1.sendKeys(Keys.ENTER).perform();

		

		driver.findElement(By.id("PG")).click();

		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi']")).click();

		for(int i=0;i<1;i++)
		{
		actions.sendKeys(Keys.DOWN).perform();
		}
		actions.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container']")).click();

		for(int i=0;i<1;i++)
		{
		actions.sendKeys(Keys.DOWN).perform();
		}
		actions.sendKeys(Keys.ENTER).perform();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();

	}
}
