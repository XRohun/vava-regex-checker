package com.example.vavaregexchecker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    private TextArea textA;
    @FXML
    private TextField textF;
    @FXML
    private Label result;
    @FXML
    protected void onHelloButtonClick() {
        String regex = textF.getText();
        String text = textA.getText();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            result.setText("OK");
        }else{
            result.setText("NG");
        }
    }
}