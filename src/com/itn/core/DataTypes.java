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
public class DataTypes {
    public static void main(String[] args) {
        
    // declaration
        int a = 0x6c6f6f73;
        float b = 10/3f;
        long l = 1118567867;
        double d = 43433.3322;
        byte e = (byte)0xdeaf;
        short f = 21334;
        
//        char = 2400;
//        char = 'c';
//        char c ='c';
//        int a = c;
        
        System.out.println("int: "+a);
        System.out.println("float: "+b);
        System.out.println("long: "+Long.MAX_VALUE);
        System.out.println("double: "+d);
        System.out.println("byte "+e);
        System.out.println("short: "+Short.MIN_VALUE);
    }
}
