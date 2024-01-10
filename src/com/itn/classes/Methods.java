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
public class Methods {

    //Member Variable or Instance Variable
    private static int a = 10;
    public int b = 100;
    
    public static void showA(){
        System.out.println("The value of a is: " +a);
    }
    
    public void showB(){
    
        System.out.println("The value of b is: " +b);
    }
    
    public int getB(){
        return b;
    }
    
    
    public int getA(){
        return a;
    }
    
    public void setA(int i){
        a = i; 
        System.out.println("A is "+a);
    }
    
    public void setB(int i){
        b = i;
        System.out.println("B is " +b);
     
    }
    
    public int displaySum(int a, int b){
        // Member variable first = local variable last
        // To access member variable, type this.a
        Methods.a = a;
        this.b = b;
        
        int sum = a + b;
        return sum;
    }
    
    
    public static void main(String[] args) {
     
        Methods.showA(); // static methods can be accessed without using objects
        showA();
        
        Methods m1 = new Methods();
        m1.showB();
        //showB();
        
        m1.setA(10000);
        m1.setB(12000);
        
        int x = m1.getA();
        System.out.println(x);
        System.out.println(m1.getB());
        
        System.out.println(m1.displaySum(1436, 5184));;
    }
 
}

/* Today's Assignment

Write a program to add different data types. 
    
addInt()
addFloat()
addDouble()
addString()

using 
with return type
no return type


*/



