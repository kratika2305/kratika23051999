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
public class index 
{
     public static void main(String args[])
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter array elements");
        for(int i =0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         for(int i =0;i<n;i++)
        {
           System.out.println(a[i]+" "+i);
           System.out.println();
        }
    }
    
}
