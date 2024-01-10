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
public class PalindromeOrNotNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Number to Check: ");
        int n = sc.nextInt();
        int temp = n, reverse = 0;
        
        while(temp !=0)
        {
            reverse = reverse *10;
            reverse = reverse + temp%10;
            temp = temp/10;
        }
        
        if (n == reverse)
               System.out.println(n+" is a palindrome number");
        else
            System.out.println(n+" is not a palindrome number");
    }
}
