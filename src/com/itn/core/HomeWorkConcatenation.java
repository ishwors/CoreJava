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
public class HomeWorkConcatenation {

    public static void main(String[] args) {
        
        /* Today's Assignment 

   --> INSERT INTO staff (name,lastname) values('Hari','KC')
   --> SELECT 'Hari' FROM country 'Nepal' 
*/

        String name = "Hari";
        String lastName = "KC";
        String country = "Nepal";
        
        System.out.println("SELECT '" +name +"' FROM '" +country+"'");
        
        String info = "SELECT '"+name+"' FROM '"+country+"'";
        System.out.println(info);
        //country = name;
        
        //System.out.println(country);
        
        
    }
    
}
