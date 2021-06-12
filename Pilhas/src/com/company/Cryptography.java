package com.company;

import java.util.LinkedList;

public class Cryptography {
    private LinkedList<Character> text = new LinkedList<Character>();

    public void criptography(String text){
        for(int i = text.length()-1; i >= 0; i--){
            this.text.add(text.charAt(i));
        }
    }

    public void deCriptography(){
        String decripText = this.toString();

        this.text.clear();

        for(int i = decripText.length()-1; i >= 0; i--){
            this.text.add(decripText.charAt(i));
        }
    }

    public String toString(){
        StringBuilder text = new StringBuilder();
        if(this.text.size() > 0) {
            for (int i = 0; i < this.text.size(); i++) {
                text.append(this.text.get(i));
            }
        }else{
            text.append("vazio");
        }

        return text.toString();
    }
}
