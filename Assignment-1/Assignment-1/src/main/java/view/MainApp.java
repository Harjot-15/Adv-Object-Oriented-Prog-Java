package view;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Assignment Application");
        this.primaryStage.getIcons().add(new Image("/images/appIcon.png"));  // Sets application icon
        loadChartView();
    }

    private void loadChartView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/ChartView.fxml"));
            AnchorPane chartView = (AnchorPane) loader.load();

            Scene scene = new Scene(chartView);
            scene.getStylesheets().add("/css/style.css");  // Load styles

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
