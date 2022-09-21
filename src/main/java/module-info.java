module com.madwesh.app_opener {
    requires javafx.controls;
    requires javafx.fxml;
    requires json;
    requires javax.websocket.api;


    opens com.madwesh.app_opener to javafx.fxml;
    exports com.madwesh.app_opener;
}