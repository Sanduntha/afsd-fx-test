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
    void addition(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        result = num1 + num2;

    }

    @FXML
    void divison(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        result = num1 / num2;
    }

    @FXML
    void multipication(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        result = num1 * num2;
    }

    @FXML
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
