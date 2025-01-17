package modules; // Définit le package dans lequel se trouve la classe TestRunner.

import io.cucumber.junit.Cucumber; // Importation de la classe Cucumber pour exécuter les tests Cucumber.
import io.cucumber.junit.CucumberOptions; // Importation de l'annotation @CucumberOptions pour configurer l'exécution des tests.
import org.junit.runner.RunWith; // Importation de l'annotation @RunWith pour indiquer le moteur de test à utiliser.

@RunWith(Cucumber.class) // Annotation qui indique que cette classe utilise Cucumber pour exécuter les tests.
@CucumberOptions(
        // Option `plugin` pour spécifier les rapports de sortie.
        plugin = { "pretty", "html:target/cucumber-reports.html" }, // Génère un rapport de test lisible (`pretty`) et un fichier dans le dossier `target`.

        // Option `features` pour indiquer le chemin vers le dossier contenant les fichiers de scénarios `.feature`.
        features = {"src/test/resources/Features/add_university.feature"}, // Chemin relatif vers le dossier où se trouvent les fichiers de caractéristiques.

        // Option `glue` pour spécifier les packages contenant les définitions des étapes.
        glue = {"modules", "stepDefinition"}// Liste des packages qui contiennent les classes de hooks et de définition des étapes.

        // Décommenter et personnaliser l'option `tags` si vous souhaitez exécuter des scénarios spécifiques.
        //tags = "@talentxpoConnexion"
)
public class TestRunner {
    /*

     Cette classe ne nécessite pas de méthodes ou de variables. Elle sert simplement de configuration pour exécuter les tests avec Cucumber.
    */
}

