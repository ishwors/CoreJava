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
public class EligibleForVoteOrNot {
    
    public static void main(String[] args) {
        
        int age = 147;
        
        if (age<0 || age>146)
        {
            System.err.println("You must be an Alien. Welcome to Planet Earth!");
        }
        
        else if (age==0)
        {
            System.out.println("Where do you come from?");
        }
            
        else if (age>=16 || age>=145)
        {
            System.out.println("Thank you for you time. You are eligible to vote.");
        }
        
        else
        {
            System.out.println("To vote you must be 16 or above. Thank You.");
        }
        
// ----------------------------------------------------------------------------

        int ageA;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        ageA = sc.nextInt();
        
        
        if (ageA<0 || ageA>146)
        {
            System.err.println("Whoa!! You must be an Alien. Welcome to Planet Earth!");
        }
        
        else if (ageA==0)
        {
            System.out.println("Where do you come from? What do you eat?");
        }
            
        else if (ageA>=16 || ageA>=145)
        {
            System.out.println("Thank you for you time. You are eligible to vote.");
        }
        
        else
        {
            System.out.println("To vote you must be 16 or above. Thank You.");
        }
    }
}
