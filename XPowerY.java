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
public class XPowerY {
    
    
    public int calc(int x, int y){
        
        if(y == 0) return 1;
        
        else return x * calc(x, y-1);
        
    }
    
}
