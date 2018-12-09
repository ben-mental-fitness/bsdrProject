package net.quipV.Model;

/*
 *Structure for storing 1 respondent from SQL database
 *Contains basic logic & getter/setter functions
 */

import java.util.function.Consumer;

public class Respondent implements Comparable<Respondent> {
    private final int respondentID;
    //private final String interviewType;
    private boolean showInVis;

    public Respondent(RespondentBuilder builder) {
        this.respondentID = builder.respondentID;
        //this.interviewType = builder.interviewType;
        showInVis = true;
    }

    public static class RespondentBuilder {
        public int respondentID;
        //public String interviewType;

        public Respondent build() {
            return new Respondent(this);
        }

        public RespondentBuilder with(Consumer<RespondentBuilder> func){
            func.accept(this);
            return this;
        }

    }

    public int getRespondentID() {
        return respondentID;
    }

    //public String getInterviewType() {return interviewType;}

    public boolean isShowInVis() {
        return showInVis;
    }

    public void setShowInVis(boolean showInVis) {
        this.showInVis = showInVis;
    }

    @Override
    public int compareTo(Respondent r) {
        int compareID=r.getRespondentID();
        return this.respondentID-compareID;
    }
}
