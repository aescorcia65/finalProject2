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
public abstract class Letters extends Charaters{
    private String size;
    
    public Letters(){
        this.size = "lower";
        super.setCharater(' ');
        super.setColor(new int[3]);
        super.setFont("");
        
        
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
        /**
     * @return the chars
     */
    @Override
    public char getCharater() {
        return super.getCharater();
    }

    /**
     * @param charater the chars to set
     */
    @Override
    public void setCharater(char charater) {
        super.setCharater(charater);
    }

    /**
     * @return the color
     */
    @Override
    public int[] getColor() {
        return super.getColor();
    }

    /**
     * @param color the color to set
     */
    @Override
    public void setColor(int[] color) {
        super.setColor(color);
    }

    /**
     * @return the font
     */
    @Override
    public String getFont() {
        return super.getFont();
    }

    /**
     * @param font the font to set
     */
    @Override
    public void setFont(String font) {
        super.setFont(font);
    }
    
    @Override
    public Label getLabel() {
        return super.getLabel();
    }
    
    
    
    
        public abstract void anim();
    
}
