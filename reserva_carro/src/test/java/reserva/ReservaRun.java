package reserva;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Classe para rodar testes BDD com Cucumber.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"reserva.steps"},
    plugin = {"pretty", "html:target/cucumber-report"},
    monochrome = true
)
public class ReservaRun {
    // executa o Cucumber
}