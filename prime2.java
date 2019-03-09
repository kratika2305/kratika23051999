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
public class prime2
{
    
     public static void main(String[] args) 
    {Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int n= sc.nextInt();
        int f=0;
        for(int i=2;i<=n/2;i++)
        {
        
        if (n%i==0)
        {
             f=1;
        }
        }
        if(f==1)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
       
    }
    
}
