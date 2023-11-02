package controller;

import model.DatabaseConnection;
import model.Processor;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class TableViewController {

    @FXML
    private TableView<?> tableView;  // TableView element in the TableView.fxml.

    private Processor processor;
    private DatabaseConnection dbConnection;

    public TableViewController() {
        this.processor = new Processor();
        this.dbConnection = new DatabaseConnection();
    }

    @FXML
    private void initialize() {
        // Initialization code here, for instance, populating the table data
        loadData();
    }

    private void loadData() {
        // Load data for the table view here using the Processor and DatabaseConnection objects
    }

}
