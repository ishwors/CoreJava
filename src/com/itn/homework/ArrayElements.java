/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.homework;

import java.util.Scanner;

/**
 *
 * @author SAURAV
 */


/* Assignment 

    Create 4*4 matrix
    add elements to the matrix
    display matrix elements
*/

public class ArrayElements {
 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        int [] [] c = new int[4] [4];
                
        for(int i = 0; i<c.length; i++){
            for(int j = 0; j<c[0].length; j++)
            {
                System.out.println("c["+i+"] ["+j+"] = ");
                c[i] [j] = sc.nextInt();
            }
        }
        System.out.println("\n"+"The array elements are: "+"\n");
        
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[0].length; j++)
            {
                System.out.println("c["+i+"] ["+j+"] = " +c[i][j]);
                
            }
        }
    }
}
