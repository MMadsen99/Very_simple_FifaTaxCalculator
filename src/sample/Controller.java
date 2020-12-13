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

    public void saveInInventory(){

        String first = FirstTextField.getText();
        String second = SecondTextField.getText();
        String third = ThirdTextField.getText();

        FirstTextArea.appendText(first + ", " + " " + second + ", " + " " + third );


        FirstTextField.clear();
        SecondTextField.clear();
        ThirdTextField.clear();
    }
    public void clearInventory(){
        FirstTextArea.clear();
    }
}

