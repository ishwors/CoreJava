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
import java.util.Scanner;

public class MatrixMultiplicationUsingArray {
   
    public static void main(String[] args) {
        
    int fr, fc, sr, sc, sum = 0, c, d, k;
 
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix: ");
      fr = scan.nextInt();
      fc = scan.nextInt();
 
      int first [] [] = new int [fr] [fc];
 
      System.out.println("Enter the elements of first matrix: ");
 
      for ( c = 0 ; c < fr ; c++ )
         for ( d = 0 ; d < fc ; d++ )
            first [c] [d] = scan.nextInt();
 
      System.out.println("Enter the number of rows and columns of second matrix: ");
      sr = scan.nextInt();
      sc = scan.nextInt();
 
      if ( fc != sr )
         System.out.println("Matrices with entered orders can't be multiplied with each other.");
      else
      {
         int second [] [] = new int[sr] [sc];
         int multiply [] [] = new int[fr] [sc];
 
         System.out.println("Enter the elements of second matrix");
 
         for ( c = 0 ; c < sr ; c++ )
            for ( d = 0 ; d < sc ; d++ )
               second [c] [d] = scan.nextInt();
 
         for ( c = 0 ; c < fr ; c++ )
         {
            for ( d = 0 ; d < sc ; d++ )
            {   
               for ( k = 0 ; k < sr ; k++ )
               {
                  sum = sum + first [c] [k] * second [k] [d];
               }
 
               multiply [c] [d] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of entered matrices: ");
 
         for ( c = 0 ; c < fr ; c++ )
         {
            for ( d = 0 ; d < sc ; d++ )
               System.out.print(multiply [c] [d] +"\t");
 
            System.out.print("\n");
         }
      }
     
    }
}
