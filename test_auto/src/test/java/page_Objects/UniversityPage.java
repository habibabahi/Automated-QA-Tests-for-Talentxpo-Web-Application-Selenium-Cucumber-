package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static modules.Hooks.driver;

public class UniversityPage {
    @FindBy(xpath="//div[@id='root']/div/div/div/div/div[2]/ul/div/a/div[2]/span")
    private static WebElement buttonBusiness;

    @FindBy(xpath="//div[@id='root']/div/div/div/div/div[2]/ul/div[2]/div/div/div/a/div[2]/span")
    private static WebElement buttonUniversity;

    @FindBy(xpath="(//button[@type='button'])[4]")
    private static WebElement buttonAddUniversity;

    @FindBy(id=":r1m:")
    private static WebElement inputUniversityName;

    @FindBy(id=":r3b:")
    private static WebElement inputUniversityWebsite;

    @FindBy(id="demo-simple-autocomplete")
    private static WebElement inputUniversityCountry;

    @FindBy(id=":r3e:")
    private static WebElement inputUniversityCity;

    @FindBy(id=":r3g:")
    private static WebElement inputUniversityAddress;

    @FindBy(id=":r3h:")
    private static WebElement inputUniversityPostalCode;

    @FindBy(id=":r3i:")
    private static WebElement inputUniversityLanguage;

    @FindBy(id=":r3k:")
    private static WebElement inputUniversityDescription;

    @FindBy(id=":r3l:")
    private static WebElement inputProfessionalPartnership;

    @FindBy(id=":r3n:")
    private static WebElement inputAcademicPartnership;

    @FindBy(css=".MuiGrid-root:nth-child(12) path")
    private static WebElement inputUniversityLogo;

    @FindBy(css=".css-1x8ve88")
    private static WebElement inputBrochuresPosters;

    @FindBy(id=":r3p:")
    private static WebElement inputContactName;

    @FindBy(id=":r3q:")
    private static WebElement inputContactPosition;

    @FindBy(id=":r3r:")
    private static WebElement inputContactEmail;

    @FindBy(id="Autocomplete-adresse")
    private static WebElement inputContactPostalAddress;

    @FindBy(id=":r3u:")
    private static WebElement inputContactPhone;

    @FindBy(id=":r3v:")
    private static WebElement inputProgramName;

    @FindBy(id=":r40:")
    private static WebElement inputProgramField;

    @FindBy()
    private static WebElement inputProgramDegree;

    @FindBy(id=":r42:")
    private static WebElement inputProgramAddress;

    @FindBy(id=":r43:")
    private static WebElement inputProgramPostalCode;

    @FindBy(id=":r44:")
    private static WebElement inputProgramWebsite;

    @FindBy(id=":r45:")
    private static WebElement inputProgramCampus;

    @FindBy(id=":r47:")
    private static WebElement inputProgramFee;

    @FindBy(id=":r48:")
    private static WebElement inputProgramPrerequisites;

    @FindBy(css=".css-1mhmd60 > .MuiChip-label")
    private static WebElement buttonSave;











    public static void setButtonAddUniversity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(buttonBusiness));
        buttonBusiness.click();
        buttonUniversity.click();
        buttonAddUniversity.click();
    }

}
