/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sezarcrypt;

/**
 *
 * @author Admin
 */
public class rotation {
    private String qtext;
    private String rtext;
    private Integer key;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }
    
    public String getQtext() {
        return qtext;
    }

    public void setQtext(String qtext) {
        this.qtext = qtext;
    }

    public String getRtext() {
        return rtext;
    }

    public void setRtext(String rtext) {
        this.rtext = rtext;
    }
   
    public int contoInt(String text,int i){
    int num = (int)text.charAt(i);
    return num;
    }
  
    public String contochar(int i){
        String text =Character.toString((char) i);
    return text;
    }
    
    public String emethod(String text,int rot){
        String etext = "";
        for(int i=0;i<text.length();i++){
           int ascii = contoInt(text,i);
           
           if(ascii >64 && ascii <91){
            ascii=(((ascii+rot)-65)% 26)+65;
        }
           else if(ascii>96 && ascii <123){
               ascii=(((ascii+rot)-97)% 26)+97;
           }
          etext=etext+contochar(ascii);
        }
        return etext;
    }
    public String dmethod(String text,int rot){
         String etext = "";
        for(int i=0;i<text.length();i++){
           int ascii = contoInt(text,i);
           
           if(ascii >64 && ascii <91){
            ascii=(((ascii-rot+26)-65)% 26)+65;
        }
           else if(ascii>96 && ascii <123){
               ascii=(((ascii-rot+26)-97)% 26)+97;
           }
          etext=etext+contochar(ascii);
        }
        return etext;
        
    }
}
