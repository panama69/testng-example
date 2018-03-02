package net.mf.lft.examples;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.GeneralLeanFtException;
import net.mf.LogMessages;
import org.testng.annotations.*;
import unittesting.UnitTestClassBase;

public class Automation_02 extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod() {
    }

    @Test
    @Parameters({"Operating_System", "Browser_Name", "Browser_Version", "Base_URL"})
    public void test_02(String os, String browserName, String browserVer, String baseUrl) throws GeneralLeanFtException, ReportException, InterruptedException {
        long id = Thread.currentThread().getId();
        new LogMessages().logMethod(new Object(){}, "Thread id is: " + id+ "\n\tArgs Passed: "+ os+", "+browserName+", "+browserVer+", "+baseUrl);
        Reporter.reportEvent(os, "Browser: "+browserName+" Ver: "+browserVer+" BaseUrl: "+baseUrl);
    	Thread.sleep(5000);
    }

}