/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import javafx.scene.control.Label;

/**
 *
 * @author Andrew
 */
public abstract class Charaters {
    private char chars;
    private int[] color;
    private String font;
    private Label label;
    
    public Charaters(){
        this.chars = ' ';
        this.color = new int[3];
        this.font = "";
        this.label = new Label();
        
    }

    /**
     * @return the chars
     */
    public char getCharater() {
        return chars;
    }

    /**
     * @param charater the chars to set
     */
    public void setCharater(char charater) {
        this.chars = charater;
    }

    /**
     * @return the color
     */
    public int[] getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int[] color) {
        this.color = color;
    }

    /**
     * @return the font
     */
    public String getFont() {
        return font;
    }

    /**
     * @param font the font to set
     */
    public void setFont(String font) {
        this.font = font;
    }
    
    public Label getLabel(){return label;}
    
    
}
