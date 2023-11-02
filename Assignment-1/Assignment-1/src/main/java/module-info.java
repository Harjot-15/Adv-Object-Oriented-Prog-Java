module com.example.assignmentModule {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens view to javafx.graphics, javafx.fxml;
   // opens com.example.assignment1 to javafx.fxml;
    opens controller to javafx.fxml;
   // exports com.example.assignment1;
    exports controller;
}

