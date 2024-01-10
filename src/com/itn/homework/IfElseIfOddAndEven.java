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
public class IfElseIfOddAndEven {
    
    public static void main(String[] args) {
        
        long  a = 0L;
     
        
        if(a==0)
        {
            System.out.println("0 is neither odd or even");
        }
        
        else if (a%2==0)
        {
            System.out.println("Even");
        }
        
        else
        {
            System.out.println("Odd");
        }
        
// ----------------------------------------------------------------------------        
        
        long  b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
         b = sc.nextInt();
         System.out.println("");
        
        if(b==0)
        {
            System.out.println(b+" is neither odd or even");
        }
        
        else if (b%2==0)
        {
            System.out.println(b+" is Even");
        }
        
        else
        {
            System.out.println(b+" is Odd");
        }
    }
    
}


/*
Assignment

1. WAP to find the even and odd number

2. WAP that determines the position of Student i.e. Distinction, First Division, Second Division,
   Third Division, Fail. (Use <= or >=)

3. WAP that determine whether the person is eligible to cast a vote or not.

*/
