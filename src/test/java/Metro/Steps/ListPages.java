package Metro.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ListPages {

	private WebDriver driver;

	@FindBy(how = How.ID, using = "propertyTypes")
	private WebElement ListProperty;

	@FindBy(how = How.ID, using = "businessType")
	private WebElement ListBusiness;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/form/div[4]/div/div[1]/div/div/div")
	private WebElement ListFromArea;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/form/div[4]/div/div[2]/div/div/div/div[1]/div")
	private WebElement ListFromAreaEnd;

	@FindBy(how = How.NAME, using = "location")
	private WebElement txtLocation;

	public ListPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void listTypeProperty(String typeProperty) {

		ListProperty.click();

		WebElement selectList = driver.findElement(By.xpath("//*[text()='" + typeProperty + "']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", selectList);
		selectList.click();
	}

	public void listBusinessType(String typeBusiness) {

		ListBusiness.click();

		WebElement selectList = driver.findElement(By.xpath("//*[text()='" + typeBusiness + "']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", selectList);
		selectList.click();
	}

	public void listBathRoom(String bathroom) {
		WebElement selectBathRoom = driver.findElement(
				By.xpath("//div[@class=\"form-check\"]//label/input[@id=\"bathroom-list-" + bathroom + "\"]//.."));
		selectBathRoom.click();
	}

	public void listArea(String area) {
		ListFromArea.click();

		WebElement selectList = driver.findElement(By.xpath("//*[text()='" + area + "']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", selectList);
		selectList.click();
	}

	public void listEndArea(String areaEnd) {
		ListFromAreaEnd.click();

		WebElement selectList = driver.findElement(By.xpath("//*[text()='" + areaEnd + "']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", selectList);
		selectList.click();
	}

}
