package com.example.newjavafxproj;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label wordOccurrence;

    @FXML
    protected void onMainButtonClick() {


        wordOccurrence.setText("Test");
        //FIXME - add values to import console results from wordOccurrences class.
    }


}