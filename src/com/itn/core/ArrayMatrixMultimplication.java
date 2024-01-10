/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.core;

import java.util.Scanner;

/**
 *
 * @author SAURAV
 */
public class ArrayMatrixMultimplication {

    public static void main(String[] args) {
        
        System.out.println("Enter First Matrix: ");
        Scanner sc = new Scanner(System.in);
        
        int [] [] a = new int [2] [3];
        int [] [] b = new int [3] [2]; 
        int [] [] prod = new int [2] [2];
        
        
        
        
           for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.println("a["+i+"] ["+j+"] = ");
                a [i] [j] = sc.nextInt();   
          
            }
        }    
     
       for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.println("b["+i+"] ["+j+"] = ");
                b [i] [j] = sc.nextInt();   
          
            }
        }    
        
        
        for(int i = 0; i < 2; i++){
            for(int k = 0; k < 2; k++)
            {
                for(int j =0; j < 3; j++)
                {
                    prod [i] [k] += a [i] [j] + b [j] [k];
                }
            }
        }
            
    }
}
