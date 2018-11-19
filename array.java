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
public class array 
{
    public static void main(String[] args) 
    {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
        int N= sc.nextInt();
        System.out.println("enter K");
        int K= sc.nextInt();
        int[] a=new int[N];
        int s=0;
        System.out.println("enter array");
        for(int i =0;i<N;i++)
        {
           a[i]=sc.nextInt();
            
        }
         for(int i =0;i<K;i++)
        {
           s=s+a[i];
            
        }
        System.out.println(s);
      
    }
    
}  

