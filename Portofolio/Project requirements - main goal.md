## Main Goal

The main goal of the project is to decrease the time and effort needed to create visualisations for causal chain analysis. In order to achieve this, we need to provide a cross platform application (Windows and macOS) described as follows:
### Functional requirements
- data is loaded from a mySQL database
- data is represented internally as a graph structure that connects drivers to outcomes using weighted edges
- the data is presented to the user as an interactive directed graph
- information about the drivers, outcomes and edges is displayed when the user hovers over them
- the vertices in the graph can be dragged. The metadata about the position of the vertices is maintained  
- the user can apply filters on the graph (eg. filtering out edges with weights under a certain value) 
- the user can customise the values used as weights on the edges
- the graph can be saved as an image 

### Non-functional requirements

- the application interface has an easy to use interface
- a vertex can be both a driver and an outcome, i.e. an outcome can have a driver, but can in turn be a driver for another outcome
- the graph can be cyclic
- the graph will be displayed in an intuitive way, grouping drivers and outcomes into stories
