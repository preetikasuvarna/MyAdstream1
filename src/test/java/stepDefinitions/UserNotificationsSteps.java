package stepDefinitions;

import com.sun.jna.platform.win32.Netapi32Util;
import cucumber.api.java.en.Then;
import dataObjects.ContextDataObject;
import helpers.BaseStep;

/**
 * Created by Preetika.Suvarna on 17/05/2017.
 */
public class UserNotificationsSteps {
    BaseStep baseStep;
    ContextDataObject contextDataObject;

    public UserNotificationsSteps(BaseStep baseStep, ContextDataObject contextDataObject) {
        this.baseStep = baseStep;
        this.contextDataObject = contextDataObject;
    }


}
