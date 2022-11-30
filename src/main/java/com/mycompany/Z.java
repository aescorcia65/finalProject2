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
public class Z extends Letters {
    
    public Z(String size, int r, int g, int b,String font){
        super.setSize(size);
        super.setColor(new int[]{r,g,b});
        super.setFont(font);
        if(super.getSize().equalsIgnoreCase("upper")){
            super.setCharater('H');
        }
        else if(super.getSize().equalsIgnoreCase("lower")){
            super.setCharater('h');
        
        }
        super.getLabel().setFont(Font.font(super.getFont(),50));
        super.getLabel().setTextFill(rgb(super.getColor()[0],super.getColor()[1],super.getColor()[2]));
        super.getLabel().setText(Character.toString(super.getCharater()));
        
    }
    
    @Override
    public void anim(){
        TranslateTransition z = new TranslateTransition();
        z.setNode(super.getLabel());
        z.setCycleCount(TranslateTransition.INDEFINITE);
        z.setByX(5);
        z.setAutoReverse(true);
        z.play();
    }
    
}

