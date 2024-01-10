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
public class AccessUsage {
    
    public static void main(String[] args) {
        
        AccessDemo ad = new AccessDemo();
        
        System.out.println(ad.a);
        System.out.println(ad.b); // cannot be accessed in another package
        System.out.println(ad.c); // cannot be accessed in another package
        //System.out.println(ad.d); // cannot be accessed because it is private
    }
    
    public class SubClass
    {
        
    }
    
}
