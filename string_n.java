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
public class string_n 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
         System.out.println("enter n");
       int n = sc.nextInt();
       for(int i=0;i<n;i++)
       {
         System.out.println(s);   
       }
        
    }
    
}
