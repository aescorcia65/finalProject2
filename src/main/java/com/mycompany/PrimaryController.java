package com.mycompany;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class PrimaryController implements Initializable {

    
    @FXML
    private TextField textbox;
    @FXML
    private TextFlow flow;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        
    }

    
    @FXML
    private void click(){
        WordtoLetter wl = new WordtoLetter();
        flow.getChildren().clear();
        ArrayList<Letters> list = wl.split(textbox.getText());
        
        for (int i = 0; i < list.size(); i++){
            flow.getChildren().add(list.get(i).getLabel());
            list.get(i).anim();
        }
//        for (Letters let: arr){
//            
//            hbox.getChildren().add(let.getLabel());
//        
//        }
//        Random random = new Random();
//        Letters h = new H("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS");
//        Letters e = new E("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Arial Black");
//        Letters l = new L("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Yu Gothic");
//        Letters ll = new L("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Symbol");
//        Letters o = new O("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"SimSun");
//        
//        
//
//        Letters w = new W("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Arial Black");
//        Letters o2 = new O("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS");
//        Letters r = new R("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Dialog");
//        Letters l2 = new L("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Yu Gothic");
//        Letters d = new D("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Monospaced");
//        hbox.getChildren().addAll(h.getLabel(),e.getLabel(),l.getLabel(),ll.getLabel(),o.getLabel(),w.getLabel(),o2.getLabel(),r.getLabel(),l2.getLabel(),d.getLabel());
        
    }

}
