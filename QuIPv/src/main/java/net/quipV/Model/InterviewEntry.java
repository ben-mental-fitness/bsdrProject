package net.quipV.Model;

import java.util.function.Consumer;

/**
 *Structure for internal storing of 1 entry from database
 */
public class InterviewEntry {

    private final String questionID;
    private final String question;
    private final String respondentID;
    private final String interviewType;
    private final String fullAnswer;
    private final String brokenAnswer;
    private final String driver;
    private final String primaryOutcome;
    private final String secondaryOutcome;
    private final String tertiaryOutcome;
    private final String projectName;

    public InterviewEntry(InterviewEntryBuilder builder) {
        this.questionID = builder.questionID;
        this.question = builder.question;
        this.respondentID = builder.respondentID;
        this.interviewType = builder.interviewType;
        this.fullAnswer = builder.fullAnswer;
        this.brokenAnswer = builder.brokenAnswer;
        this.driver = builder.driver;
        this.primaryOutcome = builder.primaryOutcome;
        this.secondaryOutcome = builder.secondaryOutcome;
        this.tertiaryOutcome = builder.tertiaryOutcome;
        this.projectName = builder.projectName;
    }


    public static class InterviewEntryBuilder {
        public String questionID;
        public String question;
        public String respondentID;
        public String interviewType;
        public String fullAnswer;
        public String brokenAnswer;
        public String driver;
        public String primaryOutcome;
        public String secondaryOutcome;
        public String tertiaryOutcome;
        public String projectName;


        public InterviewEntry build() {
            return new InterviewEntry(this);
        }

        public InterviewEntryBuilder with(Consumer<InterviewEntryBuilder> func){
            func.accept(this);
            return this;
        }

    }

    public String getQuestionID() {
        return questionID;
    }

    public String getQuestion() {
        return question;
    }

    public String getRespondentID() {
        return respondentID;
    }

    public String getInterviewType() {return interviewType;}

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

    public String getProjectName() {
        return projectName;
    }

    public String toString(){
        return "Interview entry with:" +
                "\n questionID = " + this.questionID +
                "\n question = " + this.question +
                "\n respondentID = " + this.respondentID +
                "\n full answer = " + this.fullAnswer +
                "\n broken answr = " + this.brokenAnswer +
                "\n driver = " + this.driver +
                "\n primary outcome = " + this.primaryOutcome +
                "\n secondary outcome = " + this.secondaryOutcome +
                "\n tertiary outcome = " + this.tertiaryOutcome +
                "\n project name = " + this.projectName + "\n";
    }

}
