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
public class pallindrome 
{
     public static void main(String[] args) 
    {Scanner sc = new Scanner(System.in);
        System.out.println("enter N<=1000");
        int N= sc.nextInt();
        int m=N;
        int s=0;
        while(N!=0)
        {  
           int r=N%10;
            s= s*10+r;
            N=N/10;
            
           
        }
        if (m==s)
        {
             System.out.println("yes");
        }
        else
        {
             System.out.println("No");
        }
      
    }
}
