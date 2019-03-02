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
public class array_sort 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n =sc.nextInt();
      
        int a[]=new int[n];
        System.out.println("enter a");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
          int k=a.length-1;
    for(int i=1;i<a.length;i++)
    {
        for(int j=0;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    System.out.println("largest element="+a[0]);
    System.out.println("smallest element="+a[k]);
    }
    
}
