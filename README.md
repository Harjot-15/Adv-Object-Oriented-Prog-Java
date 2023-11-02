

# Assignment1 Project Structure

Welcome to the Assignment1 project! Below you'll find an overview of the directory and file structure.

```
/Assignment1
│
├── /src
│   ├── /main
│      ├── /java
│       │   ├── /controller
│       │   │   ├── ChartController.java
│       │   │   └── TableViewController.java
│       │   │
│       │   ├── /model
│       │   │   ├── Processor.java
│       │   │   └── DatabaseConnection.java
│       │   │
│       │   └── /view
│       │       ├── MainApp.java
│       │       ├── ChartView.fxml
│       │       └── TableView.fxml
│       │
│       └── /resources
│           ├── /css
│           │   └── style.css
│           │
│           └── /images
│               └── appIcon.png
└── /sql
    └── (setup.sql)


## Directory Breakdown

- **/src/main/java/controller**: Contains the Java files related to controlling the behavior of the application's interface.
  
- **/src/main/java/model**: Houses the Java files which define the application's data structure, logic, and functions.

- **/src/main/java/view**: Contains both Java and FXML files that define the structure and behavior of the application's user interface.

- **/src/main/resources**: Holds all resource files like CSS for styling and images for the application's interface.

- **/sql**: Contains SQL-related files.

Thank you for going through the project structure.
