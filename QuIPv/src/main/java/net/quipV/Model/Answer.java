package net.quipV.Model;

/*
 *Structure for storing answers for a DataNode
 *Contains basic logic & getter/setter functions
 */

import java.util.*;

public class Answer {
    private final String fullAnswer;
    private final ArrayList<String> brokenAnswer;
    private final String driverOfChange;
    private final ArrayList<String> outcome;
    private final String domain;
    private final String driver;
    private final String driverDomain;

    public Answer(String fullAnswer, ArrayList<String> brokenAnswer, String driverOfChange,
                  ArrayList<String> outcome, String domain, String driver, String driverDomain) {
        this.fullAnswer = fullAnswer;
        this.brokenAnswer = brokenAnswer;
        this.driverOfChange = driverOfChange;
        this.outcome = outcome;
        this.domain = domain;
        this.driver = driver;
        this.driverDomain = driverDomain;
    }

    public String getFullAnswer() {
        return fullAnswer;
    }

    public ArrayList<String> getBrokenAnswer() {
        return brokenAnswer;
    }

    public String getDriverOfChange() {
        return driverOfChange;
    }

    public ArrayList<String> getOutcome() {
        return outcome;
    }

    public String getDomain() {
        return domain;
    }

    public String getDriver() {
        return driver;
    }

    public String getDriverDomain() {
        return driverDomain;
    }
}
