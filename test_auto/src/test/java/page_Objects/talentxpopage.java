package page_Objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class talentxpopage {

    private static WebDriver driver;

    @FindBy(name = "email")
    private static WebElement inputEmail;

    @FindBy(name = "password")
    private static WebElement inputPassword;

    @FindBy(css = "button.MuiButton-containedPrimary.MuiButton-fullWidth")
    private static WebElement buttonConnecter;


    @FindBy(css = "span.MuiTypography-root.MuiTypography-body1.MuiListItemText-primary.css-yb0lig")
    private static WebElement buttonDeconnecter;

    @FindBy(xpath = "//span[text()='Déconnection']") // Si le texte du bouton est "Déconnecter"
    private static WebElement mainLogoutButton;

    @FindBy(xpath = "//*[@data-testid='MoreVertIcon']")
    private static WebElement menuToggleButton;

    @FindBy(xpath="//div[@id='long-menu']/div[3]/ul/li/div[2]/span") // Si le texte du bouton est "Déconnecter"
    private static WebElement menuLogoutButton;




    // Méthode pour effectuer la connexion
    public static void sendmailpass(String mail, String pass) {
        inputEmail.sendKeys(mail);
        inputPassword.sendKeys(pass);
    }

    public static void clikConnect() {
        buttonConnecter.click();
    }

    // Méthode pour vérifier l'URL et déterminer si la connexion a réussi ou échoué
    public static void indicating() {
        try {
            // Attente pour que le bouton soit visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Attente de 5 secondes
            wait.until(ExpectedConditions.visibilityOf(buttonDeconnecter));

            // Vérifier si le bouton est visible
            if (buttonDeconnecter.isDisplayed()) {
                System.out.println("Connexion réussie. Le bouton de déconnexion est visible.");
            } else {
                System.out.println("Échec de la connexion. Le bouton de déconnexion n'est pas visible.");
            }
        } catch (Exception e) {
            System.out.println("Échec de la connexion. Exception: " + e.getMessage());
        }

    }

    public static void logoutWithMainButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(mainLogoutButton));
        mainLogoutButton.click();
    }

    public static void logoutWithMenuButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(menuToggleButton));
        menuToggleButton.click();
        menuLogoutButton.click();
    }

    public static void ShouldSeeTheConnectButton() {
        try {
            // Attente pour que le bouton soit visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Attente de 5 secondes
            wait.until(ExpectedConditions.visibilityOf(buttonConnecter));

            // Vérifier si le bouton est visible
            if (buttonConnecter.isDisplayed()) {
                System.out.println("Déonnexion réussie. Le bouton de connexion est visible.");
            } else {
                System.out.println("Échec de la déconnexion. Le bouton de connexion n'est pas visible.");
            }
        } catch (Exception e) {
            System.out.println("Échec de la déconnexion. Exception: " + e.getMessage());
        }

    }
}


