package model;

import java.util.List;

public class Processor {

    private DatabaseConnection dbConnection;

    public Processor() {
        this.dbConnection = new DatabaseConnection();
    }

    /**
     * Process and return data for chart.
     * @return Processed data for chart.
     */
    public List<?> processChartData() {
        List<?> rawData = dbConnection.getChartData();
        // Process rawData as required
        return rawData;  // returning rawData directly
    }

    /**
     * Process and return data for table view.
     * @return Processed data for table view.
     */
    public List<?> processTableData() {
        List<?> rawData = dbConnection.getTableData();
        // Process rawData as required
        return rawData;
    }

}
