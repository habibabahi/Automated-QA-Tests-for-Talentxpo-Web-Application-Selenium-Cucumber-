package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static page_Objects.UniversityPage.setButtonAddUniversity;

public class addUniversityStepDef {
    @Given("I am on the Add University page")
    public void iAmOnTheAddUniversityPage() {
        setButtonAddUniversity();
    }

    @When("enter all required details")
    public void enterAllRequiredDetails() {
    }
}
