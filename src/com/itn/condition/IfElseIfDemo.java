/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.condition;

/**
 *
 * @author SAURAV
 */
public class IfElseIfDemo {

    public static void main(String[] args) {
        
//        int a = 3;
//        int b = 2;
//        
//        if(a==1 || a==0)
//        {
//            System.out.println("You are first");
//        }
//        
//        else if(a==2)
//        {
//            System.out.println("You are second");
//        }
//        
//        else if (a==3)
//        {
//            System.out.println("You are third atleast");
//        }
//        
//        else 
//        {
//            System.out.println("You are Noob");
//        }

        int a = 4;
        int b = 6;
        int c = 10;
        
        if (a<b && b>c)
        {
            System.out.println("THe greatest number is "+b);
        }
        
        else if(a>b && a>c)
        {
            System.out.println("The greatest number is "+a);
        }
        
        else if(a<c && b<c)
        {
            System.out.println("The greatest number is "+c);
        }
           
        else
        {
            System.out.println("I don't know which is the greatest num");
        }
                
    }
    
    
}
