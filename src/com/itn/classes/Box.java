/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.classes;

import java.util.Scanner;

/**
 *
 * @author SAURAV
 */
public class Box {
    
    int l, b, h;
        
        void volumeA()
        {
            System.out.println("Volume A: " + (l*b*h));
            System.out.println();
        }
        
        void volumeB()
        {
            System.out.println("Volume B: " + (l*b*h));
        }
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Box b1 = new Box();
        
        System.out.print("Enter length: ");
        b1.l = sc.nextInt();
        
        System.out.print("Enter breadth: ");
        b1.b = sc.nextInt();
        System.out.print("Enter height: ");
        
        b1.h = sc.nextInt();
        
        b1.volumeA();
        
        
        Box b2 = new Box();
        
        System.out.print("Enter length: ");
        b2.l = sc.nextInt();
        
        System.out.print("Enter breadth: ");
        b2.b = sc.nextInt();
        System.out.print("Enter height: ");
        
        b2.h = sc.nextInt();
        
        b2.volumeB();
        
    }
}
