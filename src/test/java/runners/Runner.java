package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@US_027_TC03",
        dryRun= false)

public class Runner {
}
