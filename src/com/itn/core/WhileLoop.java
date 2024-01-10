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
public class WhileLoop{

	public static void main(String args[]){
	
	int [] a = {1, 3, 5, 7, 9};
	
	int count = 0;
	
	System.out.println("The array elements are: ");
	
            while(count<5)
            {
            System.out.println("a[" +count +"] = " +a[count]);
            count++;
            }
        
        }
}			
