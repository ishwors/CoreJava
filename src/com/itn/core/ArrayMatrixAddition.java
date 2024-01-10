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
public class ArrayMatrixAddition {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] [] a = new int [2] [2];
        int [] [] b = new int [2] [2];
        int [] [] sum = new int [2] [2];
        
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                System.out.println("a["+i+"] ["+j+"] = ");
                a [i] [j] = sc.nextInt();   
          
            }
        }    
        System.out.println("The array elements for a are: "); 
        
        
        
            
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                 System.out.println("a["+i+"] ["+j+"] = " + a[i] [j]);
                 
            }
        }
        System.out.println();
        
        
        
        
        
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                System.out.println("b["+i+"] ["+j+"] = ");
                b [i] [j] = sc.nextInt();   
          
            }
        }    
        System.out.println("The array elements for b are: "); 
        
        
        
            
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                 System.out.println("b["+i+"] ["+j+"] = " + b[i] [j]); 
            }
        }
        
        
        
        
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                 sum [i] [j] = a[i] [j] + b [i] [j];    
                 
            }
        }
        System.out.println();
        System.out.println("Sum: ");
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                
                System.out.print(sum[i] [j] +"\t");
                
                 
            }
            System.out.println();
        }
        
    }
}
