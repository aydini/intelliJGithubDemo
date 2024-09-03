module aydin.intellijgithubdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens aydin.intellijgithubdemo to javafx.fxml;
    exports aydin.intellijgithubdemo;
}