package com.mycompany;

import javafx.scene.control.Label;

public class Space extends Letters {
    public Space(){
        super.setCharater(' ');
        super.getLabel().setText(Character.toString(super.getCharater()));

    }

    public Label getLabel() {
        return super.getLabel();
    }

    @Override
    public void anim() {
        // TODO Auto-generated method stub
        
    }
}
