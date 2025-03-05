package lk.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class CalcController {


    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    private int result;

    @FXML
    //Add Number
    void addition(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        result = num1 + num2;
    }

    @FXML
    //Divide Number
    void divison(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        result = num1 / num2;
    }
    
    @FXML
    //Multiplication Number
    void multipication(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        result = num1 * num2;
    }

    @FXML
    //Subtraction Number
    void substraction(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        result = num1 - num2;
    }


    @FXML
    void answer(ActionEvent event) {
        System.out.println(result);
    }

}
