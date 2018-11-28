package net.quipV.Model;

import java.util.function.Consumer;

public class InterviewEntry {

    private final int questionID;
    private final String question;
    private final int respondentID;
    private final String fullAnswer;
    private final String brokenAnswer;
    private final String driver;
    private final String primaryOutcome;
    private final String secondaryOutcome;
    private final String tertiaryOutcome;

    public InterviewEntry(Builder builder) {
        this.questionID = builder.questionID;
        this.question = builder.question;
        this.respondentID = builder.respondentID;
        this.fullAnswer = builder.fullAnswer;
        this.brokenAnswer = builder.brokenAnswer;
        this.driver = builder.driver;
        this.primaryOutcome = builder.primaryOutcome;
        this.secondaryOutcome = builder.secondaryOutcome;
        this.tertiaryOutcome = builder.tertiaryOutcome;
    }

    public static class Builder {
        public int questionID;
        public String question;
        public int respondentID;
        public String fullAnswer;
        public String brokenAnswer;
        public String driver;
        public String primaryOutcome;
        public String secondaryOutcome;
        public String tertiaryOutcome;

        public InterviewEntry build() {
            return new InterviewEntry(this);
        }

        public Builder with(Consumer<Builder> func){
            func.accept(this);
            return this;
        }

    }

    public int getQuestionID() {
        return questionID;
    }

    public String getQuestion() {
        return question;
    }

    public int getRespondentID() {
        return respondentID;
    }


    public String getFullAnswer() {
        return fullAnswer;
    }

    public String getBrokenAnswer() {
        return brokenAnswer;
    }

    public String getDriver() {
        return driver;
    }

    public String getPrimaryOutcome() {
        return primaryOutcome;
    }

    public String getSecondaryOutcome() {
        return secondaryOutcome;
    }

    public String getTertiaryOutcome() {
        return tertiaryOutcome;
    }

}
