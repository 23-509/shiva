import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.google.com");

        
        driver.manage().window().maximize();

        
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver Java");

        
        searchBox.submit();

       
        try { Thread.sleep(3000); } catch (InterruptedException e) {}

        
        System.out.println("Page title is: " + driver.getTitle());

      
        driver.quit();
    }
}
