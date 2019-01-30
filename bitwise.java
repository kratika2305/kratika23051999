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
public class bitwise 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 no");
        int m = sc.nextInt();
         System.out.println("enter 2 no");
        int n = sc.nextInt();
        m=m^n;
        n=m^n;
        m=m^n;
         System.out.println(m);
          System.out.println(n);
        
    }
    
}
