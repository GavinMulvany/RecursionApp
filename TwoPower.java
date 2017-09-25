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
public class TwoPower {
    
    private int input;
    
    public TwoPower(){
        input = 0;
    }
    
    
    public int calc(int input){
        
       if(input==0) return 1;
       
       else return 2 * calc(input-1);
       
        
    }

}
