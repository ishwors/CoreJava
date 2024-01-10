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
public class SwitchDemoWeekDays {
 
    public static void main(String[] args) {
        
        
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number from 1-7 to display days: ");
        days = sc.nextInt();
        
        switch(days){
            
            case 1:
                System.out.println("Sunday");
                break;
                
            case 2:
                System.out.println("Monday");
                break;
                
            case 3:
                System.out.println("Tuesday");
                break;    
             
            case 4:
                System.out.println("Wednesday");
                break;
                
            case 5:
                System.out.println("Thursday");
                break;    
                
            case 6:
                System.out.println("Friday");
                break;
                
            case 7:
                System.out.println("Saturday");
                break;    
                
            default:
                System.err.println("Invalid Input! Just put Number from 1 - 7 to display days");
        }
    }
}
