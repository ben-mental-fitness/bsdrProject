package net.quipv.logic.Models;

/*
 *Structure for storing a project
 *Contains questions, answers and respondents
 */

import java.util.ArrayList;
import java.util.function.Consumer;

public class Project {
    private final String name;
    private final ArrayList<Question> questions;
    private final ArrayList<Answer> answers;
    private final ArrayList<Respondent> respondents;

    public Project(ProjectBuilder builder) {
        this.name = builder.name;
        this.questions = builder.questions;
        this.answers = builder.answers;
        this.respondents = builder.respondents;
    }

    public static class ProjectBuilder {
        public String name;
        public ArrayList<Question> questions;
        public ArrayList<Answer> answers;
        public ArrayList<Respondent> respondents;

        public Project build() {return new Project(this);}

        public ProjectBuilder with(Consumer<ProjectBuilder> func){
            func.accept(this);
            return this;
        }
    }

    public String toString(){
        StringBuilder returnString = new StringBuilder("Questions: ");
        for (Question q : this.questions) {
            returnString.append(q.getQuestionID() + ", ");
        }

        returnString.append("\nAnswers: ");
        for (Answer a : this.answers) {
            returnString.append(a.getQuestionID() + ", ");
        }

        returnString.append("\nRespondents: ");
        for (Respondent r : this.respondents) {
            returnString.append(r.getRespondentID() + ", ");
        }
        returnString.append("\n\n");

        return returnString.toString();
    }

}
