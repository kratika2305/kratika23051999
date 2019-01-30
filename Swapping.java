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
public class Swapping 
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter one no");
     int a=sc.nextInt();
      System.out.println("enter second no");
     int b=sc.nextInt();
     int temp;
     temp=a;
     a=b;
     b=temp;
      System.out.println(a);
          System.out.println(b);
     
     
 }   
}
