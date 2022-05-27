package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasesPage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/features",
    glue = "steps",
    tags = "@Hover",
    plugin = { "html:target/cucumber-html-report.html",
    "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
    "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
    monochrome = true
  
)
 
public class Runner {
    
    @AfterClass 
    public static void cleanDriver() throws InterruptedException{
    Thread.sleep(6000);
    BasesPage.closwBrowser();
    
    }
}
