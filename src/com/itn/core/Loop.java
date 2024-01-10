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
public class Loop {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char c = 'y';
        
        while( c=='y' || c =='Y'){
            
            System.out.println("*");
            
            System.out.println("Do you want to continue? : ");
            c = sc.next().charAt(0); // next() this means it only go for one single letter 
                                     //charAt(0) is placing for single letter
                                     
    // Do-While Loop - statement first condition check at last
    
//        char c = 'n';
//        
//        do{
//            System.out.println("*");
//            
//            System.out.println("Do you want to continue? : ");
//            c = sc.next().charAt(0);
//        }
//        while( c=='y' || c =='Y');
//                                     

        

        }
    }
}
