/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.homework;

/**
 *
 * @author SAURAV
 */
public class TheBitWiseOperators {
    
    public static void main(String[] args) {
        
      int a = 60;	/* 60 = 0011 1100 */ 
      int b = 13;	/* 13 = 0000 1101 */  
      int c = 0;

      c = a & b;        /* 12 = 0000 1100 */  // & (bitwise and)	
      System.out.println("a & b = " + c );

      c = a | b;        /* 61 = 0011 1101 */ // | (bitwise or)	
      System.out.println("a | b = " + c );

      c = a ^ b;        /* 49 = 0011 0001 */ // ^ (bitwise XOR)	 
    
      /*		A   B   A^B
			1   1    0
			1   0	 1	
			0   1    1
			0   0    0
      */
      System.out.println("a ^ b = " + c );

      c = ~a;           /*-61 = 1100 0011 */ // ~ (bitwise compliment)	
      System.out.println("~a = " + c );

      c = a << 2;       /* 240 = 1111 0000 */ // << (left shift)	
      System.out.println("a << 2 = " + c );

      c = a >> 2;       /* 15 = 1111 */ // >> (right shift)	
      System.out.println("a >> 2  = " + c );

      c = a >>> 2;      /* 15 = 0000 1111 */ // >>> (zero fill right shift)	
      System.out.println("a >>> 2 = " + c );

      
    }
}
