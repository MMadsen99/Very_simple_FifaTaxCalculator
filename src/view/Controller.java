package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import logik.SaveLoad;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {

    @FXML
    private TextField NavnTextField, KobsPrisTextField, AntalTextField,
                     SalgsPrisTextField, ProfitTextField, TOTALPROFIT;

    @FXML
    private TextArea log;


    //Tax from fifa FUT (5%)
    final double TAX = 0.05;
   // int startProfit = 0;
     public static int sum = 0;


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

         int profitBeforeNop = (profitAfterTax - buyPriceInt);

         int profit = profitBeforeNop * nopInt;
    
        ProfitTextField.setText(String.valueOf(profit));

        sum = sum + profit;

        log.appendText(Nop + " x " + playerName +"  PROFIT = " + sum + "\n");
        TOTALPROFIT.setText(String.valueOf(sum));

        
    }

    @FXML
    void clearLog(ActionEvent event) {

        log.clear();
        TOTALPROFIT.clear();

    }
    public void save() throws IOException {
        SaveLoad saveLoad = new SaveLoad();
        saveLoad.save();

    }
    public void load() throws FileNotFoundException {
        SaveLoad saveLoad = new SaveLoad();
        saveLoad.load();
       TOTALPROFIT.setText(String.valueOf(saveLoad.loadSum));

    }



}
