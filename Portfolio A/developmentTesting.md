Development Testing
===

### Overview

We have used a multi level testing strategy for our fi nal product. Originally we planned to create [Unit Tests](http://softwaretestingfundamentals.com/unit-testing/)
 for each module of our project  but decided that not all individual models needed testing or could be tested simply. We deemed it more valuable to test UI & some database controllers in a more real world approach by using the application ourselves. This allowed us to test a lot more inputs on the components without the overhead of setting up test data which would have been more time consuming.
 
For some modules that relied on others (e.g. Config relied on Models & Helpers) we used [Integration Testing](http://softwaretestingfundamentals.com/integration-testing/). This allowed us to build on our unit tests in order to validate the correct functioning of groups of modules.

For the UI we decided that [Systems Testing](http://softwaretestingfundamentals.com/system-testing/) was the best option. We were able to utilise Black Box [_(BBt)_](http://softwaretestingfundamentals.com/black-box-testing/), White Box [_(WBt)_](http://softwaretestingfundamentals.com/white-box-testing/) and Gray Box [_(GBt)_](http://softwaretestingfundamentals.com/gray-box-testing/) testing in order to both assess real world usage of the application whilst digging deeper to investigate edge cases only known to the developers. This was accomplished using group members that created the UI (BBt), group members who didn't work on the UI but had knowledge of the system (GBt) and the client (WBt). Examples of this working well are example by on of our UI developers discovery that, due to a bug in the D3 library, if a node was placed on another then moved away a new edge would erroneously be created. Our client was also able to inform us that the file size restrictions used for the file upload were too restrictive as when they uploaded a different dataset (one we did not have access to) they recieved a Whitelabel error. We were then able to fix this bug quite quickly due to their feedback.
 
Our client was also vital to the [Acceptance Testing](http://softwaretestingfundamentals.com/acceptance-testing/) of our application. Working with them we had created a set of functionality goals for the application which we worked towards and could measure to some extent for ourselves. This is how we initially tested our application before releasing it to the client. However, their feedback was more informative as to what they wanted as the expectations evolved throughout the project. Their continued feedback in the latter stages of the project was of great assistance to help guide our priorities when completing the application. BSDR testing gives us insight into how the application will be used in the real world, exposing bugs or flaws not apparent to our development team.

---

### Back End Testing

Below is an outline of testing for each module in the application back end:
`JUnit`
| Module | Test |
|:---:|:---:|
| Config | Integration Testing using `JUnit` & `SpringBoot Tests` building on Models & Helpers Unit Testing (WBt) |
| Controllers | System Testing uploading files with various flaws, looking for edges cases. Also using real world data from our clients (WBt, GBt, BBt) |
| Helpers | Unit Testing using `JUnit` & `SpringBoot Tests`. We have 100% code coverage to ensure everything functions as intended (WBt) |
| Models | Unit Testing using `JUnit` & `SpringBoot Tests`. We have 100% code coverage to ensure everything functions as intended (WBt) |
| Service | System Testing creating new users & security with various flaws, looking for edges cases. Also using real world data from our clients (WBt, GBt, BBt) |
| Validator | System Testing logging in with various flaws, looking for edges cases. Also using real world data from our clients (WBt, GBt, BBt) |

---

### Challenges 

|Challenge | Action |
|:---:|:---:|
|Creating tests to cover all possibilities, especially in UI|Constantly review & update tests for new developments after each sprint. Focus on boundary values and erroneous data to look for shortfalls in system|
|Integration testing across components|We will use sequence diagrams to split up tests into logic sections i.e. between UI interactions. Ideally, sections will overlap to ensure complete test coverage|
|Not allowing programmer knowledge of system influence testing|We don't want a situation where all our tests pass without really testing our application's boundaries. WBt is useful for looking at nuances in code, but we also want the overall functions to be tested stand alone. We will accomplish this using grey box testing, where team members not working on the modules in question design the tests without much knowledge of internal structures.|
|Ensuring a full run through of the program can occur without unhandled failure|We will incorporate systems testing in order to verify that all sections from high level design work together. This includes appropiately handling errors that may occur at various points in the execution of the application|
|Test need to be up to date & inline with the clients needs|We will review & update tests after every sprint we complete. This includes reviewing our testing methodology, with the aim that this scrutiny will expose any problems with our methods before they grow further down the line of development.|

---
    
#### References
[Software Testing Fundamentals](http://softwaretestingfundamentals.com) 11/11/18
