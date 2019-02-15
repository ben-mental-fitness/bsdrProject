### ProjectTest.java

| TestID | Description | Input | Expected Output |
|:---:|:---:|:---:|:---:|
|PT:CP:1|CreateProject|"TP1"|project.getName()|
|PT:CP:2|CreateProject|new ArrayList<Question>(){{add(question1);}}|project.getQuestions()|
|PT:CP:3|CreateProject|new ArrayList<Answer>(){{add(answer);}}|project.getAnswers()|
|PT:CP:4|CreateProject|new ArrayList<Respondent>(){{add(respondent1);}}|project.getRespondents()|

| TestID State | Variable Name | Action |
|:---:|:---:|:---:|
|PT:CP:1|ArrayList<String> outcomes|ArrayList<String> outcomes = new ArrayList<>()|
|PT:CP:1|outcomes|outcomes.add("O1")|
|PT:CP:1|outcomes|outcomes.add("O2")|
|PT:CP:1|outcomes|outcomes.add("O3")|
|PT:CP:1|$.fullAnswer|$.fullAnswer = "FA1"|
|PT:CP:1|$.brokenAnswer|$.brokenAnswer = "BA1"|
|PT:CP:1|$.outcomes|$.outcomes = outcomes|
|PT:CP:1|$.driver|$.driver = "D1"|
|PT:CP:1|$.respondentID|$.respondentID = 21|
|PT:CP:1|$.questionID|$.questionID = 11|
|PT:CP:1|$.respondentID|$.respondentID = 1|
|PT:CP:1|$.interviewType|$.interviewType = "Individual"|
|PT:CP:1|$.questionID|$.questionID = 1|
|PT:CP:1|$.text|$.text = "Question 1"|
|PT:CP:1|$.name|$.name = "TP1"|
