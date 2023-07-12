package Steps;

import cucumber.api.java.en.*;
import pages.GooglePage;


public class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("˄I am on the Google search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
        google.clicGoogleSearch();
    }
    @When("˄I enter a search criteria")
    public void enterSearchCriteria(){
}
@And("˄Click on the search button$")
    public void clickSearchButton(){
    }
    @Then("˄the results match the criteria$")
    public void validateResults(){
    }