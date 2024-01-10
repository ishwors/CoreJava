/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.homework;
import java.util.Scanner;
/**
 *
 * @author SAURAV
 */
public class StudentGrade {
   
    public static void main(String[] args) {
        
        int a = 35;
        
        if (a>100 || a<0)
        {
            System.err.println("Integer value is only accepted till 100");
        }
 
        else if(a>=75 && a<=100)
        {
            System.out.println("Distinction");
        }
        
        else if (a>=60 && a<=74)
        {
            System.out.println("First Division");
        }
        
        else if (a==34)
        {
            System.out.println("Consider");
        }
        
        else if (a>=35 && a<=59)
        {
            System.out.println("Second Division");
        }
        
        else
        {
            System.out.println("Fail");
        }

// ----------------------------------------------------------------------------
        
        int num;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 100: "); 
        num = sc.nextInt();
        
        
        if (num>100 || num<0)
        {
            System.err.println("Integer value is only accepted till 100");
        }
 
        else if(num>=75 && num<=100)
        {
            System.out.println("Congratulations!! You've got Distinction");
        }
        
        else if (num>=60 && num<=74)
        {
            System.out.println("Keep up the good work! You've got First Division");
        }
        
        else if (num==34)
        {
            System.out.println("This time I'll consider it!!");
        }
        
        else if (num>=35 && num<=59)
        {
            System.out.println("You need to keep it up! You've got Second Division");
        }
        
        else
        {
            System.out.println("Fail. You need to repeat the semester again!");
        }
    }
       
}
