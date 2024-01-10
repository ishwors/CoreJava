/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.condition;

/**
 *
 * @author SAURAV
 */
public class SwitchDemo {
    
    public static void main(String[] args) {
        
        int height = 150;
        
        switch(height){
            
            case 1:
                System.out.println("Taller");
                break;
             
            case 2:
                System.out.println("Short");
                break;
            
            default:
                System.out.println("Medium");
        }
    }
}
