package net.quipV.Model;

/*
 *Structure for storing answers for a DataNode
 *Contains basic logic & getter/setter functions
 */

import java.util.*;
import java.util.function.Consumer;

public class Answer {
    private final String fullAnswer;
    private final String brokenAnswer;
    private final ArrayList<String> outcome;
    private final String driver;
    private final int respondentID;
    private final int questionID;

    public Answer(AnswerBuilder builder) {
        this.fullAnswer = builder.fullAnswer;
        this.brokenAnswer = builder.brokenAnswer;
        this.outcome = builder.outcome;
        this.driver = builder.driver;
        this.respondentID = builder.respondentID;
        this.questionID = builder.questionID;
    }

    public static class AnswerBuilder {
        public String fullAnswer;
        public String brokenAnswer;
        public ArrayList<String> outcome;
        public String driver;
        public int respondentID;
        public int questionID;


        public Answer build() {
            return new Answer(this);
        }

        public AnswerBuilder with(Consumer<AnswerBuilder> func){
            func.accept(this);
            return this;
        }

    }

    public String getFullAnswer() {
        return fullAnswer;
    }

    public String getBrokenAnswer() {
        return brokenAnswer;
    }

    public ArrayList<String> getOutcome() {
        return outcome;
    }

    public String getDriver() {
        return driver;
    }

    public int getRespondentID() {return respondentID;}

    public int getQuestionID() {return questionID;}
}
