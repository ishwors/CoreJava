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
public class PalindromeTypePyramidPattern {

    public static void main(String[] args) {
        long level= Long.MAX_VALUE-1;
       
        
        for(int i = 0; i <=level; i+=2){
                       
            for(int j = 0; j < (level-i)/2; j++)
            System.out.print("  ");
        
            for(int k = 1; k < i; k++)
            {
              
                System.out.print(k+" ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
