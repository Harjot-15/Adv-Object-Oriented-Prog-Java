package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/chartDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "1994H@rjot";
    private Connection connection;

    public DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Fetch and return data for chart.
     * @return Data for chart.
     */
    public List<?> getChartData() {
        // code to fetch and return data for the chart
        List<?> chartData = new ArrayList<>();
        // SQL query and processing logic here
        return chartData;
    }

    /**
     * Fetch and return data for table view.
     * @return Data for table view.
     */
    public List<?> getTableData() {
        // code to fetch and return data for table view
        List<?> tableData = new ArrayList<>();
        // SQL query and processing logic here
        return tableData;
    }

}
