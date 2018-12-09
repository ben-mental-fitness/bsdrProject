package net.quipV.Model;

/*
 *Structure for storing 1 respondent from SQL database
 *Contains basic logic & getter/setter functions
 */

import java.util.*;

public class Respondent {
    private final ArrayList<Answer> answers;
    private final int respondentID;
    private final String interviewType;

    public Respondent(ArrayList<Answer> answers, int respondentID, String interviewType) {
        this.answers = answers;
        this.respondentID = respondentID;
        this.interviewType = interviewType;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public int getRespondentID() {
        return respondentID;
    }

    public String getInterviewType() {
        return interviewType;
    }
}
