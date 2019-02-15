### RespondentTest.java

| TestID | Description | Input | Expected Output |
|:---:|:---:|:---:|:---:|
|RT:CR:1|CreateRespondent|1|respondent1.getRespondentID()|
|RT:CR:2|CreateRespondent|"Individual"|respondent1.getInterviewType()|
|RT:CR:3|CreateRespondent|10|respondent11.compareTo(respondent1)|
|RT:CR:4|CreateRespondent|respondent11.isShowInVis()|False|

| TestID State | Variable Name | Action |
|:---:|:---:|:---:|
|RT:CR:1|$.respondentID|$.respondentID = 1|
|RT:CR:1|$.interviewType|$.interviewType = "Individual"|
|RT:CR:1|$.respondentID|$.respondentID = 11|
|RT:CR:1|$.interviewType|$.interviewType = "Individual"|
|RT:CR:4|respondent11|respondent11.setShowInVis(false)|
