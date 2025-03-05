package lk.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void login(ActionEvent event) {

        String username = txtUsername.getText();
        String password = txtPassword.getText();

//        System.out.println(username);
//        System.out.println(password);

//        if (username.equals("admin") && password.equals("1234")) {
//            System.out.println("Login Successful");
//        }
//        else {
//            System.out.println("Login Failed");
//        }

    }

    @FXML
    void signup(ActionEvent event) {

    }



}
