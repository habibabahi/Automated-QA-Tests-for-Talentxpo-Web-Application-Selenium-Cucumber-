package stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given; // Importation de l'annotation @Given pour les étapes données de Cucumber.
import io.cucumber.java.en.Then; // Importation de l'annotation @Then pour les étapes de vérification.
import io.cucumber.java.en.When; // Importation de l'annotation @When pour les étapes d'actions.
import junit.framework.Assert; // Importation de la classe Assert de JUnit pour effectuer des vérifications.
import org.openqa.selenium.By; // Importation de la classe By pour localiser des éléments web.

import static modules.Hooks.driver; // Importation de l'instance `driver` de la classe Hooks.
import static org.junit.Assert.assertTrue; // Importation de la méthode assertTrue de JUnit.
import static page_Objects.talentxpopage.*;


import org.openqa.selenium.WebDriver; // Importation de l'interface WebDriver (non nécessaire ici, car `driver` est importé de Hooks).
import org.openqa.selenium.chrome.ChromeDriver; // Importation de ChromeDriver (non nécessaire ici non plus).


public class talentxpoStepDef {

    @Given("I open the TalentXpo sign-in page")
    public void iOpenTheTalentXpoSignInPage() {
        driver.get("https://admin.talentxpo.com/signin");
    }

    @When("I enter the login {string} and password {string}")
    public void iEnterTheLoginAndPassword(String arg0, String arg1) {
        sendmailpass(arg0, arg1);
    }

    @Then("I should see a message indicating whether the login was successful or not")
    public void iShouldSeeAMessageIndicatingWhetherTheLoginWasSuccessfulOrNot() {
        indicating();
    }


    @Then("I should see the connect button")
    public void iShouldSeeTheConnectButton() {
        ShouldSeeTheConnectButton();
    }

    @And("I logout using the main logout button")
    public void iLogoutUsingTheMainLogoutButton() {
        logoutWithMainButton();
    }


    @And("I logout using the menu logout button")
    public void iLogoutUsingTheMenuLogoutButton() {
        logoutWithMenuButton();
    }

    @And("I click connect")
    public void iClickConnect() {
        clikConnect();
    }

}
