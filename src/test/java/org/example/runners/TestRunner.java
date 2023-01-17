package org.example.runners;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "org/example",
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@smoke"
)


public class TestRunner  extends AbstractTestNGCucumberTests {  }
