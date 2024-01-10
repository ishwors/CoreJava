/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.condition;

import java.util.Scanner;

/**
 *
 * @author SAURAV
 */
public class NestedIfElse {

    public static void main(String[] args) {
        
        int week;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        week = sc.nextInt();
        
        if(week>=1 && week<=7)
        {
            if(week==1)
            {
                System.out.println("Sunday");
            }
            
            else if(week==2)
            {
                System.out.println("Monday");
            }
            
            else if(week==3)
            {
                System.out.println("Tuesday");
            }
            
            else if(week==4)
            {
                System.out.println("Wednesday");
            }
            
            else if(week==5)
            {
                System.out.println("Thursday");
            }
            
            
            else if(week==6)
            {
                System.out.println("Friday");
            }
            
//            else if(week==7)
//            {
//                System.out.println("Saturday");
//            }
            else
            {
                System.out.println("Not a valid number");
            }
        }
        else
        {
            System.err.println("Please input valid number");
        }
//-----------------------------------------------------------------------------        


        int num = 1;
        
        if(num<8){
            System.out.println("You are welcome");
            
            if(num == 4){
                System.out.println("Your lucky number is 4");
            }
            else if(num == 5)
            {
                System.out.println("Your lucky number is 5");
            }
            else{
                System.out.println("Sorry no number");
            }
        }
        else{
            System.out.println("Try again next time");
        }
    }
}
