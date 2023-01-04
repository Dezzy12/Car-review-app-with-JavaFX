module com.dezzy.mavenprojects {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.dezzy.mavenprojects to javafx.fxml;
    exports com.dezzy.mavenprojects;
    exports com.dezzy.mavenprojects.carControllers;
    opens com.dezzy.mavenprojects.carControllers to javafx.fxml;

}