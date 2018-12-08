/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author hp
 */
public class sum_ap 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n");
        int n = s.nextInt();
         System.out.println("enter a");
        int a = s.nextInt();
         System.out.println("enter d");
        int d = s.nextInt();
         int s1 = 0;
         for(int i=0;i<n;i++)
         {
             s1=s1+a;
             a=a+d;
         }
         System.out.println(s1);
         
        
        
        
    }
    
}
