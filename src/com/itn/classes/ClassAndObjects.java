/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.classes;

/**
 *
 * @author SAURAV
 */

//public, private and protected are access modifiers
public class ClassAndObjects {
    
//static
    int i= 18;      // Member variables
    float f;
    String s;
    
    // Method Declaration
    void display(){
        System.out.println("Integer: " +i);
        System.out.println("Float: " +f);
        System.out.println("String: " +s);
    }
    public static void main(String[] args) {
        
        System.out.println("Inside main method");
        
        //Default Constructor is created automatically
        //obj1 is an instance variable of ClassAndObject class. 
        ClassAndObjects obj1 = new ClassAndObjects(); 
        obj1.display();
        
//        obj1.i = 10;
        obj1.f = 10.44f;
        obj1.s = "Java Program";

        obj1.display();
        ClassAndObjects obj2 = new ClassAndObjects();
        obj2.display();
//        System.out.println(i);


    }
}
