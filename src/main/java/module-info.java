module com.betulalkan.memorycardgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.betulalkan.memorycardgame to javafx.fxml;
    exports com.betulalkan.memorycardgame;
}