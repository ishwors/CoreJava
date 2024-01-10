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
public class InputWrapper {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);       
 
        System.out.print("Enter an integer: ");
        int i = Integer.parseInt(sc.nextLine());
        
        System.out.print("Enter a floating point number: ");
        float f = Float.parseFloat(sc.nextLine());        
        
           
        Integer a = i;
        System.out.println("Integer 'a = i' is converted to print as String value: " +a.toString());
        
     
        
        Integer b = i;
        
        String s = "When two String 'b = i' and 'a = i' is converted and added to String it gets concatenated as: " 
                +a.toString() + b.toString(); 
       
        System.out.println(s);
        //Float e  = (float)l;
               
       
        Integer z = a.intValue()+ b.intValue();
        System.out.println("String to Integer: " +z);
        
//------------------------------------------------------------------------------        
        Integer c = (int)f;
        System.out.println(c.toString());

        
        Integer d = (int)f;
        
        String y = c.toString() + d.toString(); 
       
        System.out.println(y);
        //Float e  = (float)l;

       
       
        Float l = c.floatValue()+ d.floatValue();
        System.out.println("String to Float: " +l);

//------------------------------------------------------------------------------        
        
        
        Float e = (float)i;
                
        byte q = 0b1100;
        i = q;
        
    }
}
