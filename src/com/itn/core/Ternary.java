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
public class Ternary {

    public static void main(String[] args) {
        int a, b, c;
        
        System.out.println("Enter two numbers: ");
        
        Scanner in = new Scanner(System.in);
         a = in.nextInt();
         b = in.nextInt();
         
         c = a > b ? a - b : b - a; // if a is greater than b it calculates a-b, 
                                    // if b is greater than a it calculates b-a.
         
         System.out.println("The larger of two number is: "+c);
         
    }
}
