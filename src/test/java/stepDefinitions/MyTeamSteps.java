package stepDefinitions;

import cucumber.api.java.en.When;
import dataObjects.ContextDataObject;
import helpers.BaseStep;
import pageObjects.TeamsDirectoryPage;

/**
 * Created by Preetika.Suvarna on 17/05/2017.
 */
public class MyTeamSteps {

    TeamsDirectoryPage teamsDirectoryPage;
    BaseStep baseStep;
    ContextDataObject contextDataObject;

    public MyTeamSteps(BaseStep baseStep, ContextDataObject contextDataObject) {
        this.baseStep = baseStep;
        this.contextDataObject = contextDataObject;
        this.teamsDirectoryPage = new TeamsDirectoryPage(baseStep.getDriver());

    }

    @When("^selects team '(.*)' from the list$")
    public void selects_team_QA_Team_Test_Group_from_the_list(String teamName) {
        contextDataObject.setLevel2(true);
        teamsDirectoryPage.clickOpenTeam(teamName);
    }
}
