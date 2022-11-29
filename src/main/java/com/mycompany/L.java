/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import javafx.animation.RotateTransition;
import static javafx.scene.paint.Color.rgb;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *
 * @author Andrew
 */
public class L extends Letters {
    
    public L(String size, int r, int g, int b,String font){
        super.setSize(size);
        super.setColor(new int[]{r,g,b});
        super.setFont(font);
        if(super.getSize().equalsIgnoreCase("upper")){
            super.setCharater('L');
        }
        else if(super.getSize().equalsIgnoreCase("lower")){
            super.setCharater('l');
        
        }
        
        super.getLabel().setFont(Font.font(super.getFont(),50));
        super.getLabel().setTextFill(rgb(super.getColor()[0],super.getColor()[1],super.getColor()[2]));
        super.getLabel().setText(Character.toString(super.getCharater()));
        
    }

    @Override
    public void anim() {
        
        RotateTransition l = new RotateTransition();
        l.setNode(super.getLabel());
        l.setDuration(Duration.seconds(2));
        l.setCycleCount(RotateTransition.INDEFINITE);
        l.setAutoReverse(true);
        l.setByAngle(30);
        l.play();    }
    
}
