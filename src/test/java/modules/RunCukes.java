package modules;

import cucumber.api.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by preetika.suvarna on 19/04/2017.
 */
    @RunWith(Cucumber.class)
    @Cucumber.Options(
            features={"src/test/resources/features/Login.feature"},
//            plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
            glue={"stepDefinitions"}
//            tags = {}
    )
    public class RunCukes{

    }
