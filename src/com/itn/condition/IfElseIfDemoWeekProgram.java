/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.condition;

/**
 *
 * @author SAURAV
 */
public class IfElseIfDemoWeekProgram {

    public static void main(String[] args) {
        
        /* Write a program that gives the O/P name of the week if the value is between 
        1-7 otherwise it should print no such name */

       int num = 1;
       
       if(num == 1)
       {
           System.out.println("Sunday");
       }
       
       else if(num == 2)
       {
           System.out.println("Monday");
       }
       
       else if(num == 3)
       {
           System.out.println("Tuesday");
       }
       
       else if(num == 4)
       {
           System.out.println("Wednesday");
       }
       
       else if(num == 5)
       {
           System.out.println("Thursday");
       }
       
       else if(num == 6)
       {
           System.out.println("Friday");
       }
       
       else if(num == 7)
       {
           System.out.println("Saturday");
       }
       
       else 
       {
           System.err.println("Invalid Input");
       }
       
        
    }
}


    