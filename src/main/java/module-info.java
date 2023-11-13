module com.j4n_r.tictactoegui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.j4n_r.tictactoegui to javafx.fxml;
    exports com.j4n_r.tictactoegui;
}