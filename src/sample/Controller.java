package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField FirstTextField;

    @FXML
    private TextField SecondTextField;

    @FXML
    private TextField ThirdTextField;

    @FXML
    private TextArea FirstTextArea;

    @FXML
    private TextArea SecondTextArea;

    @FXML
    private TextArea ThirdTextArea;

    public void SaveInInventory(){

        String first = FirstTextField.getText();
        String second = SecondTextField.getText();
        String third = ThirdTextField.getText();

        FirstTextArea.appendText(first + "\n");
        SecondTextArea.appendText(second + "\n");
        ThirdTextArea.appendText(third + "\n");

        FirstTextField.clear();
        SecondTextField.clear();
        ThirdTextField.clear();
    }
}

