/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionapp;

/**
 *
 * @author Gavin Mulvany
 */
public class Reverse {
    
    public String reverse(String in){
        
        //if the length of the word is nothing then return it
        if(in.length()==0) return in;
        
        //otherwise call this method again
        //with the 2nd and first letter
        //it will do it until none left to go through
        else return reverse(in.substring(1)) + in.charAt(0);
    }
    
}
