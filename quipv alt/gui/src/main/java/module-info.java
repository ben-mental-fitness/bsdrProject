module gui {
    requires logic;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    exports Controllers;
    opens net.spe.gui to javafx.graphics;
}