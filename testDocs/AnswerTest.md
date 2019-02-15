### AnswerTest.java

| TestID | Description | Input | Expected Output |
|:---:|:---:|:---:|:---:|
|AT:CA:1|CreateAnswer|"FA1"|answer.getFullAnswer()|
|AT:CA:2|CreateAnswer|"BA1"|answer.getBrokenAnswer()|
|AT:CA:3|CreateAnswer|outcomes|answer.getOutcomes()|
|AT:CA:4|CreateAnswer|"D1"|answer.getDriver()|
|AT:CA:5|CreateAnswer|21|answer.getRespondentID()|
|AT:CA:6|CreateAnswer|11|answer.getQuestionID()|

| TestID State | Variable Name | Action |
|:---:|:---:|:---:|
|AT:CA:1|ArrayList<String> outcomes|ArrayList<String> outcomes = new ArrayList<>()|
|AT:CA:1|outcomes|outcomes.add("O1")|
|AT:CA:1|outcomes|outcomes.add("O2")|
|AT:CA:1|outcomes|outcomes.add("O3")|
|AT:CA:1|$.fullAnswer|$.fullAnswer = "FA1"|
|AT:CA:1|$.brokenAnswer|$.brokenAnswer = "BA1"|
|AT:CA:1|$.outcomes|$.outcomes = outcomes|
|AT:CA:1|$.driver|$.driver = "D1"|
|AT:CA:1|$.respondentID|$.respondentID = 21|
|AT:CA:1|$.questionID|$.questionID = 11|
