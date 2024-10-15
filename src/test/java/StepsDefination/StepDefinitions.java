package StepsDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class StepDefinitions {

    @Given("the Notepad app is launched")
    public void launchNotepad() {
        // No need to implement anything here since launch is handled in Hooks
    }

    @When("I perform actions in Notepad")
    public void performActions() {
        // Implement the specific actions you want to perform in Notepad
    }

    @When("I perform other actions in Notepad")
    public void performOtherActions() {
        // Implement a different set of actions for this scenario
    }

    @Then("the Notepad app should behave as expected")
    public void validateNotepadBehavior() {
        // Implement validation logic for the first scenario
    }

    @Then("the Notepad app should behave differently")
    public void validateNotepadBehaviorDifferently() {
        // Implement validation logic for the second scenario
    }




    
}
