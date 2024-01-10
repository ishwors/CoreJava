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
public class DisplayNumPositiveOrNegative {
 
    public static void main(String[] args) {
        
        long display;
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        display = sc.nextLong();
        
        
        if(display>=0)
        {
            System.out.println("Positive");
        }
        
        else
        {
            System.out.println("Negative");
        }
        
    }
}
