module com.example.demooscarjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.demooscarjavafx to javafx.fxml;
    exports com.example.demooscarjavafx;
}