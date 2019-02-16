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
public class max10 
{
    public static void main(String[] args)
    { int max=0;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
         for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else if(a[i]<0)
            {
                if(max==0||a[i]>max)
                {
                    max=a[i];
                }
            }
        }
         System.out.println(max);
    }
    
}
