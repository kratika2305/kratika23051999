/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class string2 
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     
      System.out.println("enter string");
        String input=sc.nextLine();
        int c=0;
        for(int i=0;i<input.length();i++)
        {
           char ch=input.charAt(i);
           int val=(int)ch;
           if(val==32)
           {
               c++;
           }
           
        }
         System.out.println(c+1);
 }
}
