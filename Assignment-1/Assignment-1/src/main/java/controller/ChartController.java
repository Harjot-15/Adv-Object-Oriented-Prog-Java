package controller;

import model.DatabaseConnection;
import model.Processor;
import javafx.fxml.FXML;
import javafx.scene.chart.Chart;

public class ChartController {

    @FXML
    private Chart chart;  //  chart element in the ChartView.fxml

    private Processor processor;
    private DatabaseConnection dbConnection;

    public ChartController() {
        this.processor = new Processor();
        this.dbConnection = new DatabaseConnection();
    }

    @FXML
    private void initialize() {
        // Initialization code here, for instance, populating the chart data
        loadData();
    }

    private void loadData() {
        // Loads data for chart here using the Processor and DatabaseConnection objects
    }
}
