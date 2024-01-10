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
public class Tryme {

    public static void main(String[] args) {
        
        for(int i = 9; i >= 5; i --)
        {
            for(int j = 5; j <=i ; j ++)
            {
                System.out.print( +j+" ");
         
            }
            System.out.println();
            i--;
        }
    }
           
}
