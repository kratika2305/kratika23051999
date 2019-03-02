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
public class array_sum 
{
       public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n =sc.nextInt();
         int avg = 0;
        int a[]=new int[n];
        System.out.println("enter a");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
          int sum=0;
          int k=a.length;
    for(int i=0;i<a.length;i++)
    {
       sum=sum+a[i];
        avg=(int)sum/k;
    }
          
    System.out.println("avg="+avg);
    }
    
}
