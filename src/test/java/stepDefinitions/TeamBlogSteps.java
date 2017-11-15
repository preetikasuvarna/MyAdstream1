package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BaseStep;
import org.junit.Assert;
import pageObjects.NavMenuPage;
import pageObjects.TeamBlogPage;

/**
 * Created by Preetika.Suvarna on 22/05/2017.
 */
public class TeamBlogSteps {
    NavMenuPage navMenuPage;
    BaseStep baseStep;
    TeamBlogPage teamBlogPage;

    public TeamBlogSteps(BaseStep baseStep) {
        this.baseStep = baseStep;
        this.navMenuPage = new NavMenuPage(baseStep.getDriver());
        this.teamBlogPage = new TeamBlogPage(baseStep.getDriver());
    }


    @When("^opens Blog$")
    public void opens_Blog() throws Throwable {    // Express the Regexp above with the code you wish you had
        navMenuPage.sideMenuItem("Blog");
        System.out.println("Done");
    }

    @When("^Adds a new blog post as '(.*)'$")
    public void Adds_a_new_blog_post_as_Test_blog_(String blogTitle) throws Throwable {
        teamBlogPage.createTeamBlog();
        teamBlogPage.enterBlogTitle(blogTitle+ "2");
        teamBlogPage.clickSave();
    }

    @Then("^the blog must be added successfully$")
    public void the_blog_must_be_added_successfully() throws Throwable {
        Assert.assertEquals("Blog Title doesn't match", teamBlogPage.getLatestBlogTitle(), teamBlogPage.getBlogTitle());
    }

}
