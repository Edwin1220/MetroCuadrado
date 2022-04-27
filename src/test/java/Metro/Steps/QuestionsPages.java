package Metro.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsPages {

	private WebDriver driver;

	public QuestionsPages(WebDriver driver) {
		this.driver = driver;
	}

	public void downScroll() {
		WebElement downScrollType = driver.findElement(By.xpath("//header/nav[1]"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", downScrollType);
	}

	public void downScrollFilter() {
		WebElement downScrollType = driver.findElement(By.xpath("//div[@class= \"card-block\"]"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", downScrollType);
	}

	public void downScrollArea() {
		WebElement downScrollType = driver.findElement(By.xpath("//div[@class= \"card-block\"]//div[4]"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", downScrollType);
	}

	public void tiempoSegundos(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
