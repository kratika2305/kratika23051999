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
public class even 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N <=1000");
        int n= sc.nextInt();
         System.out.println("enter Q<=1000");
        int q = sc.nextInt();
        for(int i=n ; i<q ; i++)
        {
          if(i%2==0 && i!=n)
          {
           System.out.println(i+" ");
          }
        }
         System.out.println();
}
    
}
