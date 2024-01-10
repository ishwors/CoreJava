/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SAURAV
 */
public class ConvertInchesToMeters {
 
    public static void main(String[] args) {
        
        double inches;
        double m = 0.0254;
        double metres;

        DecimalFormat decFor = new DecimalFormat("0.0000");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display inches to meters: ");
        inches = sc.nextDouble();
        
        metres= inches*m;
 
        System.out.println(decFor.format(metres) +" metres");
        
    }
}
