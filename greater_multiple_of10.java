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
public class greater_multiple_of10 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int r = n%10;
        if(r==1)
        {
            n=n+9;
        System.out.println(n);
        }
        else if(r==2)
        {
            n=n+8;
        System.out.println(n);
        }
         else if(r==3)
         {
            n=n+7;
         System.out.println(n);
         }
         else if(r==4)
         {
            n=n+6;
         System.out.println(n);
         }
         else if(r==5)
         {
            n=n+5;
         System.out.println(n);
         }
            else if(r==6)
            {
            n=n+4;
            System.out.println(n);
            }
         else if(r==7)
         {
            n=n+3;
         System.out.println(n);
         }
         else if(r==8)
         {
            n=n+2;
         System.out.println(n);
         }
         else if(r==9)
         {
            n=n+1;
         System.out.println(n);
         }
        else
         {
             n=n+10;
             System.out.println(n);
         }
    }
}
