### InterviewEntryTest.java

| TestID | Description | Input | Expected Output |
|:---:|:---:|:---:|:---:|
|IET:CIE:1|CreateInterviewEntry|"1"|interviewEntry.getQuestionID()|
|IET:CIE:2|CreateInterviewEntry|"Question1"|interviewEntry.getQuestion()|
|IET:CIE:3|CreateInterviewEntry|"2"|interviewEntry.getRespondentID()|
|IET:CIE:4|CreateInterviewEntry|"Int1"|interviewEntry.getInterviewType()|
|IET:CIE:5|CreateInterviewEntry|"FA1"|interviewEntry.getFullAnswer()|
|IET:CIE:6|CreateInterviewEntry|"BA1"|interviewEntry.getBrokenAnswer()|
|IET:CIE:7|CreateInterviewEntry|"DR1"|interviewEntry.getDriver()|
|IET:CIE:8|CreateInterviewEntry|"Out1"|interviewEntry.getPrimaryOutcome()|
|IET:CIE:9|CreateInterviewEntry|"Out2"|interviewEntry.getSecondaryOutcome()|
|IET:CIE:10|CreateInterviewEntry|"Out3"|interviewEntry.getTertiaryOutcome()|
|IET:CIE:11|CreateInterviewEntry|"Project1"|interviewEntry.getProjectName()|

| TestID State | Variable Name | Action |
|:---:|:---:|:---:|
|IET:CIE:1|$.questionID|$.questionID = "1"|
|IET:CIE:1|$.question|$.question = "Question1"|
|IET:CIE:1|$.respondentID|$.respondentID = "2"|
|IET:CIE:1|$.interviewType|$.interviewType = "Int1"|
|IET:CIE:1|$.fullAnswer|$.fullAnswer = "FA1"|
|IET:CIE:1|$.brokenAnswer|$.brokenAnswer = "BA1"|
|IET:CIE:1|$.driver|$.driver = "DR1"|
|IET:CIE:1|$.primaryOutcome|$.primaryOutcome = "Out1"|
|IET:CIE:1|$.secondaryOutcome|$.secondaryOutcome = "Out2"|
|IET:CIE:1|$.tertiaryOutcome|$.tertiaryOutcome = "Out3"|
|IET:CIE:1|$.projectName|$.projectName = "Project1"|
