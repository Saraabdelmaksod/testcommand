package pack_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

    public WebDriver driver;



    @BeforeClass
    public void openHrSystem(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


    }
@Test
    public void testCase1(){
        System.out.println("test case one printed successfully ");
    }


}
