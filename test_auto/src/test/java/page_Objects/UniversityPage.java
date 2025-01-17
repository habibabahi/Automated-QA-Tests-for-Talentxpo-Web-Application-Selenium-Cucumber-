package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import static modules.Hooks.driver;

public class UniversityPage {
    @FindBy(xpath="//div[@id='root']/div/div/div/div/div[2]/ul/div/a/div[2]/span")
    private static WebElement buttonBusiness;

    @FindBy(xpath="//div[@id='root']/div/div/div/div/div[2]/ul/div[2]/div/div/div/a/div[2]/span")
    private static WebElement buttonUniversity;

    @FindBy(xpath="(//button[@type='button'])[4]")
    private static WebElement buttonAddUniversity;

    @FindBy(xpath="//div[@id='root']/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div/div/input")
    private static WebElement inputUniversityName;

    @FindBy(xpath="//div[@id='root']/div/div/div[2]/div/div[2]/div/form/div/div/div[3]/div/div/input")
    private static WebElement inputUniversityWebsite;

    @FindBy(xpath="//div[@id='root']/div/div/div[2]/div/div[2]/div/form/div/div/div[5]/div/div/div/input")
    private static WebElement inputUniversityCountry;

    @FindBy(xpath="//div[@id='root']/div/div/div[2]/div/div[2]/div/form/div/div/div[5]/div/div/div/input")
    private static WebElement inputUniversityCity;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputUniversityAddress;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputUniversityPostalCode;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputUniversityLanguage;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputUniversityDescription;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProfessionalPartnership;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputAcademicPartnership;

    @FindBy(css=".MuiGrid-root:nth-child(12) .MuiSvgIcon-root")
    private static WebElement inputUniversityLogo;

    @FindBy(css=".css-1k10yl7")
    private static WebElement inputBrochuresPosters;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputContactName;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputContactPosition;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputContactEmail;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputContactPostalAddress;

    @FindBy(css=".MuiTelInput-FlagImg")
    private static WebElement inputContactPhoneCode;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputContactPhone;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramName;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramField;

    @FindBy(xpath="//body")
    private static WebElement inputProgramDegree;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramAddress;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramPostalCode;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramWebsite;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramCampus;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramFee;

    @FindBy(xpath="//ul[@id='demo-simple-autocomplete-listbox']/li[26]")
    private static WebElement inputProgramPrerequisites;

    @FindBy(css=".css-1mhmd60 > .MuiChip-label")
    private static WebElement buttonSave;



    public static void navigateAndVerifyUniversityPage() {
        try {
            // Attente pour que le bouton "Business" soit visible et clique dessus
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(buttonBusiness));
            buttonBusiness.click();

            // Clic sur le bouton "Université" et "Ajouter une université"
            buttonUniversity.click();
            buttonAddUniversity.click();

            // Attente pour que le champ "Nom de l'université" soit visible
            wait.until(ExpectedConditions.visibilityOf(inputUniversityName));

            // Vérification de la visibilité du champ "Nom de l'université"
            if (inputUniversityName.isDisplayed()) {
                System.out.println("Step OK: Le champ 'Nom de l'université' est visible, la navigation est réussie.");
            } else {
                System.out.println("Step KO: Le champ 'Nom de l'université' n'est pas visible.");
            }
        } catch (Exception e) {
            // Gestion des exceptions avec un message d'erreur
            System.out.println("Erreur lors de la navigation ou de la vérification. Exception : " + e.getMessage());
        }
    }

    public static void selectDropdownValue(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(value); // Sélectionne l'option en fonction du texte visible
    }

    public static void uploadFile(WebElement fileInput, String filePath) {
        fileInput.sendKeys(filePath); // Envoie le chemin complet du fichier
    }

    public static void fillField(String fieldName, String fieldValue ) {
        switch (fieldName) {
            case "UniversityName":
                inputUniversityName.sendKeys(fieldValue);
                break;
            case "UniversityWebsite":
                inputUniversityWebsite.sendKeys(fieldValue);
                break;
            case "University Country": // Dropdown
                inputUniversityCountry.click();
                selectDropdownValue(inputUniversityCountry,fieldValue);
                break;
            case "UniversityCity":
                selectDropdownValue(inputUniversityCity,fieldValue);
                break;
            case "UniversityAddress":
                inputUniversityAddress.sendKeys(fieldValue);
                break;
            case "UniversityPostalCode":
                inputUniversityPostalCode.sendKeys(fieldValue);
                break;
            case "UniversityLanguage": // Dropdown
                selectDropdownValue(inputUniversityLanguage,fieldValue);
                break;
            case "UniversityDescription":
                inputUniversityDescription.sendKeys(fieldValue);
                break;
            case "ProfessionalPartnership":
                inputProfessionalPartnership.sendKeys(fieldValue);
                break;
            case "AcademicPartnership":
                inputAcademicPartnership.sendKeys(fieldValue);
                break;
            case "UniversityLogo": // Upload file
                uploadFile(inputUniversityLogo,fieldValue);
                break;
            case "BrochuresPosters": // Upload file
                uploadFile(inputBrochuresPosters,fieldValue);
                break;
            case "ContactName":
                inputContactName.sendKeys(fieldValue);
                break;
            case "ContactPosition":
                inputContactPosition.sendKeys(fieldValue);
                break;
            case "ContactEmail":
                inputContactEmail.sendKeys(fieldValue);
                break;
            case "ContactPostalAddress":
                inputContactPostalAddress.sendKeys(fieldValue);
                break;
            case "ContactPhoneCode":
                selectDropdownValue(inputContactPhoneCode,fieldValue);
                break;
            case "ContactPhone":
                inputContactPhone.sendKeys(fieldValue);
                break;
            case "ProgramName":
                inputProgramName.sendKeys(fieldValue);
                break;
            case "ProgramField":
                inputProgramField.sendKeys(fieldValue);
                break;
            case "ProgramDegree":
                selectDropdownValue(inputProgramDegree, fieldValue);
                break;
            case "ProgramAddress":
                inputProgramAddress.sendKeys(fieldValue);
                break;
            case "ProgramPostalCode":
                inputProgramPostalCode.sendKeys(fieldValue);
                break;
            case "ProgramWebsite":
                inputProgramWebsite.sendKeys(fieldValue);
                break;
            case "ProgramCampus":
                inputProgramCampus.sendKeys(fieldValue);
                break;
            case "ProgramFee":
                inputProgramFee.sendKeys(fieldValue);
                break;
            case "ProgramPrerequisites":
                inputProgramPrerequisites.sendKeys(fieldValue);
                break;

            default:
                throw new IllegalArgumentException("Unrecognized field: " + fieldName);
        }
    }

    public static void clickSaveButton() {
        buttonSave.click();
    }















}
