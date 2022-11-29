/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import static javafx.scene.paint.Color.rgb;

import javafx.animation.TranslateTransition;
import javafx.scene.text.Font;

/**
 *
 * @author Andrew
 */
public class E extends Letters {
    
    public E(String size, int r, int g, int b,String font){
        super.setSize(size);
        super.setColor(new int[]{r,g,b});
        super.setFont(font);
        if(super.getSize().equalsIgnoreCase("upper")){
            super.setCharater('E');
        }
        else if(super.getSize().equalsIgnoreCase("lower")){
            super.setCharater('e');
        
        }
        
        super.getLabel().setFont(Font.font(super.getFont(),50));
        super.getLabel().setTextFill(rgb(super.getColor()[0],super.getColor()[1],super.getColor()[2]));
        super.getLabel().setText(Character.toString(super.getCharater()));
        
    }

    @Override
    public void anim() {
        TranslateTransition e = new TranslateTransition();
        e.setNode(super.getLabel());
        e.setCycleCount(TranslateTransition.INDEFINITE);
        e.setByY(5);
        e.setAutoReverse(true);
        e.play();
    }
    
}
