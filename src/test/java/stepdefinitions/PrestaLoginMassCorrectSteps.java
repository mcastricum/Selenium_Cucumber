package stepdefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrestaLoginMassCorrectSteps {
    private WebDriver driver;

    @Given("ChromeBrowser opened with https://prod-kurs.coderslab.pl/index.php")
    public void PrestaMassLogin() {
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

    @When("click sign in button")
    public void PrestaMassLoginSignIn() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.className("user-info"));
        // Kliknij porzycisk
        element.click();
    }

    @When("Login email enter (.*)")
    public void PrestaMassLoginEmail(String loginEmail) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("email"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(loginEmail);
    }

    @When("Login password enter (.*)")
    public void PrestaMassLoginPassword(String loginPassword) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("password"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(loginPassword);
        //wyślij formularz
        element.submit();
    }

    @Then("Info on page (.*)")
    public void PrestaMassLogedIn(String expectedText) {
        System.out.println("Loging in successfully");
    }

    @Then("Fail info(.*)")
    public void PrestaMassLogInFailure(String expectedText) {
        System.out.println("Loging in failure");
    }

    @And("close ChromeBrowser")
    public void closeChromeBrowser(){
        driver.quit();
    }
}