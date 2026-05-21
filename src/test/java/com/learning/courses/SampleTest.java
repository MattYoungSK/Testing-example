package com.learning.courses;

import com.learning.courses.AbstractIntegrationTest;
import com.learning.courses.dto.CreateCourseDTO;
import com.learning.courses.model.Course;
import com.learning.courses.model.Person;
import com.learning.courses.repository.CourseRepository;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SampleTest extends AbstractIntegrationTest {



    @Test
    void testWebForm() throws Exception {
        WebDriver driver = new ChromeDriver();
        try
        {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.findElement(By.name("my-text")).sendKeys("TestowyTekst");
        driver.findElement(By.name("my-password")).sendKeys("TestoweHaslo");

        WebElement checkbox = driver.findElement(By.id("my-check-2"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        Select dropdown = new Select(driver.findElement(By.name("my-select")));
        dropdown.selectByVisibleText("Two");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("submitted"));
        }
        finally{
            driver.quit();
        }
    }
}
