/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.homework;

/**
 *
 * @author SAURAV
 */
public class TriangleTypeStar {
    
    public static void main(String[] args) {
        
        for(int i = 1; i<=5; i++)
        {
         for(int j = i; j>=1; j--)
         {
            System.out.print("*");
            System.out.print(" ");
             
         }  
         System.out.println("");
            
        }
        System.out.println("\n");
        
        
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("");
       
        }
        System.out.println("\n");
        
        
        for(int i = 5; i>= 1; i--)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print(j);
                System.out.print(" ");
                         
            }
            System.out.println("");
            
        }
        System.out.println("\n");
        
        for(int i = 1; i <= 5; i++)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("");
        }
       System.out.println("\n");
        
            for(int i = 5; i >= 1; i--)
            {
                for(int j = i; j >= 1 ; j--)
                {
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println("");
            }
            System.out.println("\n");
            
            for(int i = 5; i >= 1; i--)
            {
                for(int j = i; j <= 5; j++)
                {
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println("");
             }
            System.out.println("\n");
            
            for(int i = 1; i <= 5; i++)
            {
                for(int j = 5; j >= i; j--)
                {
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println("");
             }
            System.out.println("\n");
            
            
            for(int i = 1; i <= 5; i++)
            {
                for(int j = 5; j >= i; j--)
                {
                    System.out.print(j +" ");
                    
                }
                System.out.println();
             }
            

            
    }
}
