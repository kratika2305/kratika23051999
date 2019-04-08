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
public class min10 
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int min=0;
        int[] a = new int[n];
        System.out.println("enter array elements");
        for(int i =0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]< min )
            {
                min=a[i];
            }
            else if (a[i] > 0)
            {
            if (min == 0 || a[i] < min) {
                min = a[i];
            }
        }
            
        }
        System.out.println(min);
    }
    
}

    

