package step_definations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Amazon_Invalid_LoginPage.feature", glue = {"step_definations"},
//monochrome=true, plugin={"pretty","json:target/JSONReports/report.json"})
//monochrome=true, plugin={"pretty","junit:target/JunitReports/report.xml"})
monochrome=true, plugin={"pretty","html:target/HTMLReports/amazonInvalidLoginPage.html"})
public class Test_Runner 
{

}
