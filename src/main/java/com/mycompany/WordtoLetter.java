/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andrew
 */
public class WordtoLetter {
    
    public WordtoLetter(){
    
    }
    
    public ArrayList<Letters> split(String word){

        char[] ch = word.toCharArray();
        ArrayList<Letters> list = new ArrayList<>();
        Random random = new Random();
        for (char i : ch) {
            
        switch(i){
            case 'h':
                list.add(new H("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'e':
                list.add(new E("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'l':
                list.add(new L("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'o':
                list.add(new O("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'w': 
                list.add(new W("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'r':
                list.add(new R("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'd':    
                list.add(new D("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'H':
                list.add(new H("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'E':
                list.add(new E("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'L':
                list.add(new L("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'O':
                list.add(new O("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'W': 
                list.add(new W("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'R':
                list.add(new R("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'D':    
                list.add(new D("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            default:
                list.add(new H("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256)," "));
                break;
                
        }
}
        return list;
    }
    
}
