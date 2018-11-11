package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class Controller {
    //Tooltip Exit = new Tooltip("Вы действительно хотите выйти? Дороги назад не будет!!!" );
    @FXML
    public Button closeButton;

    @FXML
    public void CloseButtonAction(ActionEvent event)
    {
        Stage primaryStage = (Stage) closeButton.getScene().getWindow();
        primaryStage.close();
    }
}


