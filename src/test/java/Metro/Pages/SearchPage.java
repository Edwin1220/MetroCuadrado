package Metro.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Metro.Steps.ButtonPages;
import Metro.Steps.ListPages;
import Metro.Steps.QuestionsPages;

public class SearchPage {

	private ListPages listPages;
	private QuestionsPages questionsPages;
	private ButtonPages buttonPages;

	@FindBy(how = How.NAME, using = "location")
	private WebElement txtLocation;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.listPages = new ListPages(driver);
		this.questionsPages = new QuestionsPages(driver);
		this.buttonPages = new ButtonPages(driver);
	}

	public void searchOffices(String typeProperty, String typeBusiness, String location) {
		questionsPages.downScroll();
		listPages.listTypeProperty(typeProperty);
		listPages.listBusinessType(typeBusiness);
		questionsPages.downScroll();
		txtLocation.sendKeys(location);
		questionsPages.tiempoSegundos(1);
		txtLocation.sendKeys(Keys.ARROW_DOWN);
		txtLocation.sendKeys(Keys.ENTER);
		buttonPages.btnSearch();
	}

}
