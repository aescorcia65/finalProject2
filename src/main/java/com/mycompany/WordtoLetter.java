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
            case 'H':
                list.add(new H("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
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

            case 'A':
                list.add(new A("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            case 'a':
                list.add(new A("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'B':
                list.add(new B("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'b':
                list.add(new B("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'C':
                list.add(new C("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'c':
                list.add(new C("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'F':
                list.add(new F("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'f':
                list.add(new F("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'G':
                list.add(new G("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            
            case 'g':
                list.add(new G("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'I':
                list.add(new I("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'i':
                list.add(new I("Lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'j':
                list.add(new J("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'J':
                list.add(new J("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'K':
                list.add(new K("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'k':
                list.add(new K("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'M':
                list.add(new M("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'm':
                list.add(new M("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'N':
                list.add(new N("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'n':
                list.add(new N("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'P':
                list.add(new P("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            
            case 'p':
                list.add(new P("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'Q':
                list.add(new Q("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'q':
                list.add(new Q("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'S':
                list.add(new S("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 's':
                list.add(new S("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'T':
                list.add(new T("upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 't':
                list.add(new T("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'U':
                list.add(new U("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'u':
                list.add(new U("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'V':
                list.add(new V("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'v':
                list.add(new V("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'X':
                list.add(new X("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'x':
                list.add(new X("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;

            case 'Y':
                list.add(new Y("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
              
            case 'y':
                list.add(new Y("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'Z':
                list.add(new Z("Upper",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;
            
            case 'z':
                list.add(new Z("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256),"Comic Sans MS"));
                break;


            case ' ':
                list.add(new Space());
                break;

            


            default:
                list.add(new H("lower",random.nextInt(256),random.nextInt(256),random.nextInt(256)," "));
                break;


                
        }
}
        return list;
    }
    
}
