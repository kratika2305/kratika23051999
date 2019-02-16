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
public class fibo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        int a=1;
                int c, b=1;
                System.out.println(a);
                System.out.println(b);
         for(int i=0;i<(n-2);i++)
         {
             c=a+b;
             a=b;
             b=c;
             System.out.println(c);
         }
                
        
    }
    
}
