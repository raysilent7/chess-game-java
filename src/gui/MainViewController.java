package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.Serializable;

public class MainViewController implements Serializable {

    @FXML
    private Button btNewGame;

    @FXML
    private Button btContinue;

    @FXML
    public void onBtNewAction() {
        System.out.println("New Game!");
    }

    @FXML
    public void onBtContinueAction() {
        System.out.println("Continue Game");
    }
}
