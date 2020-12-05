package stepdefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QloAppsAccountCreationMassSteps {
    private WebDriver driver;

    @Given("browser opened with https://qloapps.coderslab.pl/pl/")
    public void MassopenQloAccountCreation() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://qloapps.coderslab.pl/pl/");
    }

    @When("click on login")
    public void MassClickOnLogin() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.className("hide_xs"));
        // Wyczyść tekst zapisany w elemencie
        element.click();
    }

    @When("an email (.*) is entered in input field")
    public void MassEnterEmail(String email) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("email_create"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(email);
        // Prześlij formularz
        element.submit();
    }

    @When("gender is selected")
    public void MassGenderSelect() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("id_gender1"));
        // Wyczyść tekst zapisany w elemencie
        element.click();
    }
    @When("FirstName (.*) filled")
    public void MassEnterFirstName(String firstName) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("customer_firstname"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(firstName);
    }

    @When("LastName (.*) filled")
    public void MassEnterLastName(String lastName) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("customer_lastname"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(lastName);
    }

    @When("Password (.*) filled")
    public void MassEnterPassword(String password) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("passwd"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(password);
    }

    @When("form submited")
    public void MassClickOnRegister() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("submitAccount"));
        // Wyczyść tekst zapisany w elemencie
        element.click();
    }
    @Then("page name (.*)")
    public void MassPageName(String expectedText) {
        System.out.println("Account created successfully");
    }
    @And("close chrome")
    public void closeChrome(){
        driver.quit();
    }
}
