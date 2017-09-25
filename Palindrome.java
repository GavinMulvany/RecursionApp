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
public class Palindrome {
    
    public boolean isPalindrome(String in){
        
        //if the length of the word is one or zero
        //then its a palindrome coz same back and forward
    
        if(in.length()==0||in.length()==1) return true;
        
        //if the 1st letter is same as last letter
        else if(in.charAt(0)==in.charAt(in.length()-1)){
            //then call the method again
            //with the letter from the 2nd letter to the last letter
            return isPalindrome(in.substring(1, in.length()-1));
        }
        
        //otherwise its not a palindrome
        else return false;
        
    }
    
}
