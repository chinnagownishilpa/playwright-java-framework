package com.framework.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.framework.base.BaseTest;
import com.framework.reports.ExtentManager;
import com.framework.reports.ExtentTestManager;
import com.framework.utilities.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        ExtentManager.getExtentReports();

    }

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest test =
                ExtentManager.getExtentReports()
                        .createTest(result.getMethod().getMethodName());

        ExtentTestManager.setTest(test);

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentTestManager.getTest()
                .pass("Test Passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        try {

            String path=
                    ScreenshotUtil.capture(
                            BaseTest.getPage(),
                            result.getMethod().getMethodName());

            ExtentTestManager.getTest()
                    .fail(result.getThrowable())
                    .addScreenCaptureFromPath(path);

        }

        catch(Exception e){

            e.printStackTrace();

        }

    }

    @Override
    public void onFinish(ITestContext context) {

        ExtentManager.getExtentReports()
                .flush();

    }

}