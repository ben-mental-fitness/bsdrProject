
## OO Design & UML

![ERROR: Client Server Diagram not found](clientServer.jpg)

|Component|Use|
|:---:|:---:|
|Client Front End|The UI for the application. Users choose which data to retrieve, can manipulate the visualisations & export the causal chain (dynamically or statically)|
|Client Back End|This is the logic of the application. Taking instructions from the UI, the back end retrieves data from AWS, can create causal chain visualisations & export them|
|AWS Server|External servers hosted by Amazon, which currently store the database of all research carried out by Bath SDR. Data will be retrieved by SQL to be loaded into the causal chain visualisation|

#### Back End Class Diagram

![ERROR: Back End Class Diagram not found](classDiagram.jpg)

- Main goal
- Challenges in logic & reason for choice
- Knowledge gained from modelling



#### Back End Sequence Diagram

![ERROR: Back End Sequence Diagram not found](sequenceDiagram.jpg)

- Use case
- Challenges in logic & reason for choice
- Knowledge gained from model