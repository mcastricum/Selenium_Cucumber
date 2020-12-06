package stepdefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrestaACMassSteps {
    private WebDriver driver;

    @Given("browser opened with https://prod-kurs.coderslab.pl/index.php")
    public void PrestaMassAC() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @When("click on sign in")
    public void PrestaMassClickSignIn() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.className("user-info"));
        // Kliknij porzycisk
        element.click();
    }

    @When("click on create")
    public void PrestaMassClickCreate() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.className("no-account"));
        // Kliknij porzycisk
        element.click();
    }

    @When("gender selection")
    public void PrestaMassGenderSelect() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("id_gender"));
        // Wyczyść tekst zapisany w elemencie
        element.click();
    }

    @When("FirstName (.*) entered")
    public void PrestaMassEnterFirstName(String prestaFirstName) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("firstname"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(prestaFirstName);
    }

    @When("LastName (.*) entered")
    public void PrestaMassEnterLastName(String prestaLastName) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("lastname"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(prestaLastName);
    }

    @When("email (.*) entered")
    public void PrestaMassEnterEmail(String prestaEmail) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("email"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(prestaEmail);
    }

    @When("Password (.*) entered")
    public void PrestaMassEnterPassword(String prestaPassword) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("password"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(prestaPassword);
        //wyślij formularz
        element.submit();
    }

//    @When("submit account")
//    public void PrestaMassClickOnRegister() {
//        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
//        WebElement element = driver.findElement(By.name("submitCreate"));
//        // Kliknij przycisk
//        element.click();
//    }
    @Then("Page shown (.*)")
    public void PrestaMassCreated(String expectedText) {
        System.out.println("Account created successfully");
    }
    @And("close WebBrowser")
    public void closeChrome(){
        driver.quit();
    }
}

