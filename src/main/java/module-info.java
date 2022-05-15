module com.sde.pswrdmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.sde.pswrdmanager to javafx.fxml;
    exports com.sde.pswrdmanager;
    exports com.sde.pswrdmanager.Controllers;
    opens com.sde.pswrdmanager.Controllers to javafx.fxml;
}