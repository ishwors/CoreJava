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
public class StudentDataMultiDimensionArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter No. of class: ");
        int n = sc.nextInt();
        
        System.out.println("Enter No. of subject: ");
        int m = sc.nextInt();
        
        String subjects [] [] = new String [n] [m];
        subjects [0] [0] = sc.nextLine(); //used to fix run time
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                
                System.out.println("Subjects["+i+"] ["+j+"] = ");
                
                subjects [i] [j] = sc.nextLine(); // this is compile time
            }
        }
        
    }
}
