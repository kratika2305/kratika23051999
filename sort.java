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
public class sort
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
       
        int temp=0;
        for(int i=0;i<(a.length)-1;i++)
        { 
            for(int j=0;j<(a.length)-1;j++)
            {
            if(a[j]>a[j+1])
            {
                 
            temp = a[j+1];
                 a[j+1]=a[j];
                 a[j]= temp;
                 
            }
        }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
       
    }
    
}
