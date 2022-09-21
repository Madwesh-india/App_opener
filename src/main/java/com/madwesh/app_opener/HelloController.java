package com.madwesh.app_opener;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class HelloController {
    Runtime runtime = Runtime.getRuntime();

    @FXML
    private Label welcomeText;

    @FXML

    public void onchromeButtonClick(ActionEvent actionEvent) {
        try
        {
            runtime.exec(new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"});
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void onjupyterButtonClick(ActionEvent actionEvent){
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd /d E:\\PROJECTS && jupyter notebook\"");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void onTABSButtonClick(ActionEvent actionEvent) {
        try
        {
            runtime.exec(new String[]{"C:\\Program Files\\Totally.Accurate.Battle.Simulator.v1.0.7.Incl.ALL.DLC\\TotallyAccurateBattleSimulator.exe"});
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}