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
public class AccessDemo {

    public static int a = 10;
    static int b = 20; 
    protected int c = 30; //from a subclass outside the same "package" using by creating object
    private int d = 40;
    
    
    public void display(){
   
                                       // proper way to access static content from not static area/method. AccessDemo.a , AccessDemo.b
        System.out.println("Values are: "+AccessDemo.a+ " "+AccessDemo.b+" "+c+" "+d); 
    }
    
    public static void main(String[] args) {
        
        System.out.println(a);
        
        AccessDemo ad = new AccessDemo();
        
        System.out.println(ad.b);
        //      OR CALL DIRECTLY WITHOUT CREATING OBJECT but it has to be static in class
        
     //System.out.println(AccessDemo.b);
        System.out.println(ad.c);
        System.out.println(ad.d);
        ad.display();
        
    }
}
