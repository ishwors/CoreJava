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
public class ArrayDemo {

    public static void main(String[] args) {
        
        String s = "Saurav";
        String r ="";
        int count = s.length();
        System.out.println("The original String is: "+s +"\n");
        for(int i = count; i > 0; i--){
            
            r = r+s.charAt(i-1); // s.equals() or s.contain("") or s.indexOf("") or s.lastIndextOf("")
            System.out.println(r);
        }
        System.out.println("\n"+"The reverse String is: " +r);
    }
}


/* Assignment

*
**
***
****
*****

if(j<=i){
sout("*");


1
12
123
1234
12345

12345
1234
123
12
1

1
22
333
4444
55555


Set s = 10;
{a, b, c, d, e, f, g, h, i, j}

for(Set c: s)

c = a
c = b
c = c
c = d
  .
  .
  .
    
*/