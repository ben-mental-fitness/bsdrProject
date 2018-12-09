package net.quipV.Model;

/*
 *Structure for storing questions from a given study
 *Contains questionID and questionString
 *Flag for if the question should be shown in the vis
 */

import java.util.*;

public class Question {
    private final int questionID;
    private final String text;
    private boolean showInVis;

    public Question(int questionID, String text) {
        this.questionID = questionID;
        this.text = text;
        showInVis = true;
    }

    public int getQuestionID() {
        return questionID;
    }

    public String getText() {
        return text;
    }

    public boolean isShowInVis() {
        return showInVis;
    }

    public void setShowInVis(boolean showInVis) {
        this.showInVis = showInVis;
    }
}