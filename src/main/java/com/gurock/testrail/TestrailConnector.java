package com.gurock.testrail;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestrailConnector {
    private JsonObject r;
    private APIClient client;
    private Map testResultData = new HashMap();



    public TestrailConnector() {
    }
    public TestrailConnector(String testRailPage, String testRailUser, String testRailPassword) {
        client = new APIClient(testRailPage);
        client.setPassword(testRailPassword);
        client.setUser(testRailUser);
    }
    public void sendTestResult (String testCaseId, int statusId, String comment, long elapsedTime,
                                String testRailsRunId){
        testResultData.put ("status_id", statusId);
        testResultData.put ("comment", comment);

        if (elapsedTime>0) {
            testResultData.put("elapsed", elapsedTime);
            System.out.println("Using url: " + "add_result_for_case/" + testRailsRunId + "/" + testCaseId);
            try {
                r = (JsonObject) client.sendPost("add_result_for_case/"+ testRailsRunId + "/" + testCaseId,
                testResultData);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (APIException e) {
                e.printStackTrace();
            }
        }
    }
}
