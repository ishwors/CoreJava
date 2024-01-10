/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.condition;

import java.util.Scanner;

/**
 *
 * @author SAURAV
 */
public class UserInputNameAgeAddress {
    
    public static void main(String[] args) {
        
        String name;
        int age;
        int weight;
        String address;
        
        
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        
        System.out.println("Enter your Address: ");
        address = sc.nextLine();
        
        
        System.out.println("Enter your age: ");
        age = sc.nextInt();
           
        System.out.println("Enter your weight: ");
        weight = sc.nextInt();
        
        
              
        System.out.println("\nYour name is "+name);
        System.out.println("You're "+age +" years old");
        System.out.println("You're "+weight +" kg");
        System.out.println("You live at "+address);
    }
}


/* Assignment

1. WAP that reads a number in inches, converts it to meters. (1 inch = 0.0254m)
2. WAP to test a number is positive or negative.

*/