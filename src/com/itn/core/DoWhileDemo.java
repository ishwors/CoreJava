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
public class DoWhileDemo {
 
    public static void main(String[] args){
        
        char c ='n';
        
        do{
            System.out.println("Enter data: ");
            
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            
            System.out.println("Enter another data: Y/N");
            c = sc.next().charAt(0);
        }
                while (c =='Y' || c=='y');
    }
}
