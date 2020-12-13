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
    @FXML
    private TextField TOTALPROFIT;

    @FXML
    private TextArea log;


    //Tax from fifa FUT (5%)
    final double TAX = 0.05;
    int startProfit = 0;

    @FXML
    public void beregnProfit(ActionEvent event) {
        //Buy price
        String buyPriceString = KobsPrisTextField.getText();

        //Sell price
        String sellPriceString = SalgsPrisTextField.getText();

        //Number of players
        String Nop = AntalTextField.getText();

        //Player name
        String playerName = NavnTextField.getText();

        // converting the strings to ints so i can use them in the calculation
        int sellPriceInt = Integer.parseInt(sellPriceString);
        int buyPriceInt = Integer.parseInt(buyPriceString);
        int nopInt = Integer.parseInt(Nop);

        // claculation the profit or loss after tax
        int taxLoss = (int) (sellPriceInt * TAX);

        int profitAfterTax = sellPriceInt - taxLoss;

         int profit = (profitAfterTax - buyPriceInt);

        ProfitTextField.setText(String.valueOf(profit * nopInt ));

        log.appendText(Nop + " x " + playerName +"  PROFIT = " + profit * nopInt + "\n");
        TOTALPROFIT.setText(String.valueOf(startProfit + (profit*nopInt)));
    }

    @FXML
    void clearLog(ActionEvent event) {

        log.clear();
        TOTALPROFIT.clear();

    }

}
