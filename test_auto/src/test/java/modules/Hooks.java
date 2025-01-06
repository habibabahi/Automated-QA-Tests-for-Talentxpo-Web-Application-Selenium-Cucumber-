package modules; // Définit le package dans lequel le code est organisé.

import io.cucumber.java.After; // Importation de l'annotation @After pour exécuter du code après chaque scénario Cucumber.
import io.cucumber.java.Before; // Importation de l'annotation @Before pour exécuter du code avant chaque scénario Cucumber.
import org.openqa.selenium.WebDriver; // Importation de l'interface WebDriver pour contrôler le navigateur.
import org.openqa.selenium.support.PageFactory; // Importation de PageFactory pour initialiser les éléments de la page avec Selenium.
import page_Objects.UniversityPage;
import page_Objects.talentxpopage;

import static utils.BrowserFactory.getFactoryDriver;

// Classe Hooks qui configure les actions à effectuer avant et après chaque scénario de test.
public class Hooks {
    // Déclaration de l'objet WebDriver comme variable statique pour qu'il soit accessible dans d'autres classes.
    public static WebDriver driver;

    // Déclaration et instanciation de la page GoogleSearchPage, qui représente la page de recherche Google.
    private talentxpopage talentxpopageObjects = new talentxpopage();
    private UniversityPage universityPageObjects = new UniversityPage();


    @Before // Annotation indiquant que cette méthode sera exécutée avant chaque scénario Cucumber.
    public void setUp() {
        driver = getFactoryDriver();
        // Initialisation des éléments de la page en utilisant PageFactory, ce qui permet de lier les éléments Web définis dans la classe GoogleSearchPage au WebDriver.
        PageFactory.initElements(driver, talentxpopageObjects);
        PageFactory.initElements(driver, universityPageObjects);
    }

    @After // Annotation indiquant que cette méthode sera exécutée après chaque scénario Cucumber.
    public void tearDown() {
        // Fermeture du navigateur après l'exécution du scénario pour libérer les ressources.
        driver.quit();
    }
}
