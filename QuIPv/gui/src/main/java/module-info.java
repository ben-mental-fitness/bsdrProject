module gui {
    requires logic;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    exports Controllers;
    opens net.quipv.gui to javafx.graphics;
}