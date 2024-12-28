package com.example.generaltemplate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public Label lblDisplay;

    @FXML
    public TextField txtA;
    public TextField txtC;
    public TextField txtB;

    @FXML
    public void handleCalcQuad(ActionEvent actionEvent) {
        int inpA= Integer.parseInt(txtA.getText());
        int inpB= Integer.parseInt(txtB.getText());
        int inpC= Integer.parseInt(txtC.getText());
        lblDisplay.setText(calcQuadratics(inpA,inpB,inpC));
    }
    public String calcQuadratics(int a, int b, int c){
        if (getDisc(a,b,c)<0){
            return "There are no real solutions";
        }else if(getDisc(a,b,c)==0){
            return "There is one real solution and that is " + getPlusAnswer(a,b,c);
        }else{
            return "There are 2 real solutions and those are " + getPlusAnswer(a,b,c) +","+ getMinusAnswer(a,b,c) ;
        }
    }
    public double getDisc(int a, int b, int c){
        return (Math.pow(b,2) - 4*a*c);
    }
    public double getPlusAnswer(int a, int b, int c){
        return ((-1*b + Math.sqrt(getDisc(a,b,c)))/(2*a));
    }
    public double getMinusAnswer(int a, int b, int c){
        return ((-1*b - Math.sqrt(getDisc(a,b,c)))/(2*a));
    }
}