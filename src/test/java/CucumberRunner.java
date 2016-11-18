import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue = "src/test/java/Stepdefinition", 
features = "src/test/java/Feature", 
format = { "html:target/cucumber-htmlreport", "json:target/cucumber-report.json" }, 
//tags = { "@Wag_LoginScreen_Scenario,@Wag_soapUI_runner"}, monochrome = true)
tags = { "@sample"}, monochrome = true)
public class CucumberRunner extends AbstractTestNGCucumberTests {                                                                                                                                    // @Walgreens_HomeScreen_Scenario  //@JPMC_Login_Scenario

}
