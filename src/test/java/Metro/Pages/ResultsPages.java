package Metro.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Metro.Steps.ButtonPages;
import Metro.Steps.ListPages;
import Metro.Steps.QuestionsPages;

public class ResultsPages {

	private QuestionsPages questionsPages;
	private ListPages listPages;
	private ButtonPages buttonPages;

	@FindBy(how = How.NAME, using = "startPrice")
	private WebElement txtStartPrice;

	@FindBy(how = How.NAME, using = "endPrice")
	private WebElement txtEndPrice;

	@FindBy(how = How.XPATH, using = "//div[@class=\"card-block\"]//ul//li[1]//p")
	private WebElement getArea;

	@FindBy(how = How.XPATH, using = "//div[@class=\"card-block\"]//ul//li[2]//p")
	private WebElement getBathRoom;

	public ResultsPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.questionsPages = new QuestionsPages(driver);
		this.listPages = new ListPages(driver);
		this.buttonPages = new ButtonPages(driver);
	}

	public void fillOutFilter(String initMont, String endPrice, String bathroom, String area, String areaEnd) {
		questionsPages.downScrollFilter();
		txtStartPrice.sendKeys(initMont);
		txtEndPrice.sendKeys(endPrice);
		listPages.listBathRoom(bathroom);
		questionsPages.downScrollArea();
		listPages.listArea(area);
		listPages.listEndArea(areaEnd);
		questionsPages.downScrollFilter();
		questionsPages.tiempoSegundos(1);
		buttonPages.btnFilterPrice();

	}

	public void endSearch(String area, String bathroom) {

		String getAreaTotal = getArea.getText();
		Assert.assertEquals(getAreaTotal + " m2", area);

		String getBathRoomTotal = getBathRoom.getText();
		Assert.assertEquals(getBathRoomTotal, bathroom);

	}

}