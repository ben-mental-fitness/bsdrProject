### QuestionTest.java

| TestID | Description | Input | Expected Output |
|:---:|:---:|:---:|:---:|
|QT:CQ:1|CreateQuestion|1|question1.getQuestionID()|
|QT:CQ:2|CreateQuestion|"Question 1"|question1.getText()|
|QT:CQ:3|CreateQuestion|10|question11.compareTo(question1)|
|QT:CQ:4|CreateQuestion|question11.isShowInVis()|False|

| TestID State | Variable Name | Action |
|:---:|:---:|:---:|
|QT:CQ:1|$.questionID|$.questionID = 1|
|QT:CQ:1|$.text|$.text = "Question 1"|
|QT:CQ:1|$.questionID|$.questionID = 11|
|QT:CQ:1|$.text|$.text = "Question 11"|
|QT:CQ:4|question11|question11.setShowInVis(false)|
