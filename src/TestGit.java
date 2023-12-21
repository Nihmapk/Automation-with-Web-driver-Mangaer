import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.net.*;
public class TestGit 
{

	public static void main(String[] args)
	{
		 WebDriver driver;
	

		    @BeforeAll
		 static void setupClass() 
		    {
		        WebDriverManager.chromedriver().setup();
		    }

		    @BeforeEach
		    void setupTest()
		    {
		        driver = new ChromeDriver();
		    }

		    @AfterEach
		    void teardown()
		    {
		        driver.quit();
		    }

		    @Test
		    void test()
		    {
		        // Exercise
		        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		        String title = driver.getTitle();

		        // Verify
		        assertThat(title).contains("Selenium WebDriver");
		    
		    }

	}

}
