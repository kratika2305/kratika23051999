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
public class difference_even_odd 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a");
    int a= sc.nextInt();
    System.out.println("enter b");
    int b= sc.nextInt();
    int n=a-b;
    if(n%2==0)
        System.out.println("even");
    else
        System.out.println("odd");
    }
}
    
}
