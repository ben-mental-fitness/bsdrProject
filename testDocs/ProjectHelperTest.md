### ProjectHelperTest.java

| TestID | Description | Input | Expected Output |
|:---:|:---:|:---:|:---:|
|PHT:PH:1|ProjectHelper|"This is dummy ProjectName 1"|project.getName()|
|PHT:PH:2|ProjectHelper|1|questions.get(0).getQuestionID()|
|PHT:PH:3|ProjectHelper|"This is dummy full answer 2"|answers.get(1).getFullAnswer()|
|PHT:PH:4|ProjectHelper|3|respondents.get(2).getRespondentID()|

| TestID State | Variable Name | Action |
|:---:|:---:|:---:|
|PHT:PH:1|Project project|Project project = ProjectHelper.populate(maintableRepository)|
|PHT:PH:2|ArrayList<Question> questions|ArrayList<Question> questions = project.getQuestions()|
|PHT:PH:3|ArrayList<Answer> answers|ArrayList<Answer> answers = project.getAnswers()|
|PHT:PH:4|ArrayList<Respondent> respondents|ArrayList<Respondent> respondents = project.getRespondents()|
