package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.datatable.DataTable;
import page_Objects.UniversityPage;

import static page_Objects.UniversityPage.clickSaveButton;
import static page_Objects.UniversityPage.navigateAndVerifyUniversityPage;


public class addUniversityStepDef {
    @Given("I am on the Add University page")
    public void iAmOnTheAddUniversityPage() {navigateAndVerifyUniversityPage();}


    @When("enter all required details")
    public void enterAllRequiredDetails(DataTable dataTable) {
        dataTable.asMaps(String.class, String.class).forEach(row -> {
            String field = row.get("fieldName");
            String value = row.get("fieldValue");
            UniversityPage.fillField(field,value);
        });
    }


    @And("They click on Save")
    public void theyClickOnSave() {clickSaveButton();}

    @Then("The university is added and appears in the university table under the University section with the status {string}")
    public void theUniversityIsAddedAndAppearsInTheUniversityTableUnderTheUniversitySectionWithTheStatus(String arg0) {}

}
