## Development Testing

Below is an outline of testing for each module in the application back end:

|Module | Test |
|:---:|:---:|
|QuIPv|White Box Testing (WBt) using JUnit. Tests created beforehand to account for boundary & erroneous cases (test driven development (tdd))|
|DataNode|Simple JUnit module for testing getter & setter functionality|
|SQLDataFetcher|Instead of testing SQL directly we will use the return values in java to test like QuIPv|
|DynamicVisualiser|We will use JUnit to test the logic of the visualisations. On the UI side a JFx Test Driver will be used to look for erroneous inputs|
|DynamicExporter|We will use the JS Test Driver in maven to test javascript exports in the visualisation|
|StaticExporter|We will create a checksum using the image file which will return to JUnit tests. By using an online checksum calculator to create tests this process becomes a neat way to check files. This could easily be further developed to a Digital Signature for trusted file sharing|

#### Frameworks

-  Maven
    - JS Test Driver
    - JUnit
    - JFx Test Driver

#### Challenges 

|Challenge | Action |
|:---:|:---:|
|Creating tests to cover all possibilities, especially in UI|Constantly review & update tests for new developments after each sprint. Focus on boundary values and erroneous data to look for shortfalls in system|
|Integration testing across components|We will use sequence diagrams to split up tests into logic sections i.e. between UI interactions. Ideally, sections will overlap to ensure complete test coverage|
|Not allowing programmer knowledge of system influence testing|We don't want a situation where all our tests pass without really testing our application's boundaries. WBt is useful for looking at nuances in code, but we also want the overall functions to be tested stand alone. We will accomplish this using grey box testing, where team members not working on the modules in question design the tests without much knowledge of internal structures.|
|Ensuring a full run through of the program can occur without unhandled failure|We will incorporate systems testing in order to verify that all sections from high level design work together. This includes appropiately handling errors that may occur at various points in the execution of the application|
|Test need to be up to date & inline with the clients needs|We will review & update tests after every sprint we complete. This includes reviewing our testing methodology, with the aim that this scrutiny will expose any problems with our methods before they grow further down the line of development.|