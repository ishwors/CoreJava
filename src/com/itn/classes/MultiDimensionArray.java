/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.classes;

import java.util.Scanner;

/**
 *
 * @author SAURAV==
 */
public class MultiDimensionArray {
    
    public static void main(String[] args) {
        
        int arrayD2D [] [] = new int [4] [];
        
        arrayD2D [0] = new int [1];
        arrayD2D [1] = new int [2];
        arrayD2D [2] = new int [3];
        arrayD2D [3] = new int [4];
        
        int x = arrayD2D.length;
        int y = 0, i, j;
 
        System.out.println("Enter array elements: ");
        
        Scanner sc = new Scanner(System.in);
        for(i = 0; i < x; i++){
        y = arrayD2D[i].length;
        System.out.println("No. of elements in row "+(i+1)+": "+y);
        
        for(j = 0; j < y; j++)
            arrayD2D [i] [j] = sc.nextInt();
        }
        
        for(i = 0; i < x; i++){
            y = arrayD2D[i].length;
            
            for(j = 0; j < y; j++)
                System.out.print(" " +arrayD2D [i] [j]);
            System.out.println(" ");
        }
    }
        
}
