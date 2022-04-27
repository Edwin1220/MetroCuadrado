package Metro.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	@FindBy(how = How.ID, using = "btnSearch")
	private WebElement btnSearch;

	@FindBy(how = How.ID, using = "filter-price")
	private WebElement btnFilterPrice;

	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void btnSearch() {
		btnSearch.click();
	}

	public void btnFilterPrice() {
		btnFilterPrice.click();
	}
}