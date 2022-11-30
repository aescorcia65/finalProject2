/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import javafx.animation.TranslateTransition;
import static javafx.scene.paint.Color.rgb;
import javafx.scene.text.Font;

/**
 *
 * @author Andrew
 */
public class C extends Letters {
    
    public C(String size, int r, int g, int b,String font){
        super.setSize(size);
        super.setColor(new int[]{r,g,b});
        super.setFont(font);
        if(super.getSize().equalsIgnoreCase("upper")){
            super.setCharater('C');
        }
        else if(super.getSize().equalsIgnoreCase("lower")){
            super.setCharater('c');
        
        }
        super.getLabel().setFont(Font.font(super.getFont(),50));
        super.getLabel().setTextFill(rgb(super.getColor()[0],super.getColor()[1],super.getColor()[2]));
        super.getLabel().setText(Character.toString(super.getCharater()));
        
    }
    
    @Override
    public void anim(){
        TranslateTransition c = new TranslateTransition();
        c.setNode(super.getLabel());
        c.setCycleCount(TranslateTransition.INDEFINITE);
        c.setByX(5);
        c.setAutoReverse(true);
        c.play();
    }
    
}
