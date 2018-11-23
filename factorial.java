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
public class factorial 
{
    public static void main(String[] args) 
    {Scanner sc = new Scanner(System.in);
        System.out.println("enter N<=1000");
        int n= sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);

      
    }
    
}
