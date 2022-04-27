package Metro.Definitions;

import org.openqa.selenium.WebDriver;

import Metro.Pages.ResultsPages;
import Metro.Pages.SearchPage;
import Metro.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private SearchPage searchPage = new SearchPage(driver);
	private ResultsPages resultsPages = new ResultsPages(driver);

	@Given("^open navegator$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^select type property list (.*) business (.*) search location (.*)$")
	public void fillOutForm(String typeProperty, String typeBusiness, String location) {
		this.searchPage = new SearchPage(driver);
		this.searchPage.searchOffices(typeProperty, typeBusiness, location);
	}

	@And("^fill out form filter init mont (.*) from mont (.*) amount bathroom (.*) and area (.*) end area (.*)$")
	public void fillOutFormFilter(String initMont, String endPrice, String bathroom, String area, String areaEnd) {
		this.resultsPages = new ResultsPages(driver);
		this.resultsPages.fillOutFilter(initMont, endPrice, bathroom, area, areaEnd);
	}

	@Then("^Validate (.*) (.*)$")
	public void valid(String area, String bathroom) {
		this.resultsPages = new ResultsPages(driver);
		this.resultsPages.endSearch(area, bathroom);
		
	}
}