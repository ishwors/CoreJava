/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.classes;

import java.util.Scanner;

/**
 *
 * @author SAURAV
 */

//Single Dimension Array

public class SingleDimensionArray {

    public static void main(String[] args) {
        
             Scanner sc = new Scanner(System.in);    
        
        int [] values = new int [10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Input array element: ");
            
            values [i] = sc.nextInt(); 
            System.out.println("values ["+i+"] = "+i);
        }
   
    }
}
