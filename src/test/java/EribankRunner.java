import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/erikbank.feature" , tags="@CasoAlterno")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/nombre.feature")
public class EribankRunner {
	
}
/*
@CucumberOptions(features = "src/test/resources/features/AgendarCitas.feature", tags = "@TestCase1", snippets = SnippetType.CAMELCASE, plugin = {
"json:target/cucumber_json/cucumber.json" })

@RunWith(RunnerPersonalizado.class)
public class EribankRunner {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
	DataToFeature.overrideFeatureFiles("./src/test/resources/features/");
	}
}
*/