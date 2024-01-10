/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.core;

/**
 *
 * @author SAURAV
 */
public class TypeCasting {
    
    public static void main(String[] args) {
        
        int a = 12;
        float c = 12.77f;
        double e = 34.21;
        long l = 2_500_020_003L; //underscore separating like comma
        
        int b = (int)(a+c);
        System.out.println(b);
        
        //float f = (float)((a + b) *((e / a) + b - c)); //Type Casting
        int f = (int)((a + b) * ((e / a) + b - c));
        System.out.println(f);
        
        float result = (float)l;
        System.out.println(Long.MAX_VALUE);
        System.out.println(result);
        
    }
}
