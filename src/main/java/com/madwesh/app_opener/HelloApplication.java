package com.madwesh.app_opener;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

import org.json.JSONException;
import org.json.JSONObject;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws URISyntaxException {
        final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(new URI("ws://192.168.0.108:8000/"));

        clientEndPoint.addMessageHandler(message -> {
            JSONObject jo = new JSONObject();
            try {
                jo = new JSONObject(message);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            System.out.println(jo);
        });
        launch();
    }
}