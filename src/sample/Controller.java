package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.StringReader;

public class Controller {

    @FXML
    private TextField NavnTextField;

    @FXML
    private TextField KobsPrisTextField;

    @FXML
    private TextField AntalTextField;

    @FXML
    private TextField SalgsPrisTextField;

    @FXML
    private TextField ProfitTextField;


    //Tax from fifa FUT (5%)
    final double TAX = 0.05;
   // String profitString = ProfitTextField.getText();
    //int currentProfit = Integer.parseInt(profitString);

    @FXML
    void beregnProfit(ActionEvent event) {

        //Buy price
        String buyPriceString = KobsPrisTextField.getText();

        //Sell price
        String sellPriceString = SalgsPrisTextField.getText();

        //Number of players
        String Nop = AntalTextField.getText();

        int sellPriceInt = Integer.parseInt(sellPriceString);
        int buyPriceInt = Integer.parseInt(buyPriceString);
        int nopInt = Integer.parseInt(Nop);

        int taxLoss = (int) (sellPriceInt * TAX);

        int profitAfterTax = sellPriceInt - taxLoss;

        int profit = (profitAfterTax - buyPriceInt);

        ProfitTextField.setText(String.valueOf(profit * nopInt ));


    }

    @FXML
    void clearInventory(ActionEvent event) {

    }

}
