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
public class NewArrayDemo {

    public static void main(String[] args) {
        
//        int [] a = {1, 3, 5, 7, 9};
        
//        for(int elements: a)
//        {
//            System.out.println(elements);
//        }
    
//    for(int i = 0; i<a.length; i++){
//        System.out.println(" a["+i+"] =  "+a[i]);
//    }
    
//        String country = ("Nepal",
        Scanner sc = new Scanner(System.in);

        int [] [] b = new int[3] [2];
        
        for(int i = 0; i<b.length; i++){
            for(int j = 0; j<b[0].length; j++)
            {
                System.out.println("b["+i+"] ["+j+"] = ");
                b[i] [j] = sc.nextInt();
            }
        }
        System.out.println("The array elements are: ");
        
        for (int i = 0; i < b.length; i++){
            for(int j = 0; j < b[0].length; j++)
            {
                System.out.println("b["+i+"] ["+j+"] = " +b[i][j]);
                
            }
        }

         
    }
}

/* Assignment 

    Create 4*4 matrix
    add elements to the matrix
    display matrix elements
*/
    
