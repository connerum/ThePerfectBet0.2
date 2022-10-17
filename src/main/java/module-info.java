module edu.bsu.cs222.theperfectbet {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.path;
    requires json.smart;


    opens edu.bsu.cs222.theperfectbet to javafx.fxml;
    exports edu.bsu.cs222.theperfectbet;
}