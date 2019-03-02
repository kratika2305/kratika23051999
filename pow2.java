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
public class pow2 
{
     public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int c=0;
        int f=0;
        while(n>1)
        {
            if(n%2!=0)
            {
            f=1;
             
            }
          n=n/2;
             
        }
          if(f==1)
            System.out.println("no");
        else
            System.out.println("yes");
     
    }
    
}
