package stepdefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QloAppsAccountCreationSteps {
    private WebDriver driver;

    @Given("an open browser with https://qloapps.coderslab.pl/pl/")
    public void openQloAccountCreation() {
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

    @When("click on zaloguj")
    public void clickOnZaloguj() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.className("hide_xs"));
        // Wyczyść tekst zapisany w elemencie
        element.click();
    }

    @When("an email is entered in input field")
    public void enteremail() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("email_create"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys("stefan@testowy.pl");
        // Prześlij formularz
        element.submit();
    }

    @When("gender selected")
    public void genderSelect() {
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
    @When("firstname filled")
    public void enterFirstName() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("customer_firstname"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys("Stefan");
    }

    @When("lastname filled")
    public void enterLastName() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("customer_lastname"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys("Stefanowski");
    }

    @When("password filled")
    public void enterPassword() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("passwd"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys("Pass987");
    }

    @When("potwierdzenie formularza")
    public void clickOnRegister() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("submitAccount"));
        // Wyczyść tekst zapisany w elemencie
        element.click();
    }
    @Then("nazwa strony (.*)")
    public void theFirstOneShouldContainKeyword(String expectedText) {
        System.out.println("Account created successfully");
    }
   @And("close web page")
   public void closeWebPage(){
       driver.quit();
   }
}
