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
public class UserInputDemo {
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        
        String name = sc.nextLine();
        
        System.out.println("Your name is " +name);
        
        System.out.println("Enter you age: ");
        int age = sc.nextInt();
        
        System.out.println(name+" your age is " +age);
    }
}
