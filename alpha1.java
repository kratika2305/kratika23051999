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
public class alpha1 
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter string");
     char  n = sc.next().charAt(0);
    
    if ((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
      {
          
              System.out.println("Alphabet");
          
      }
    else
    {
        System.out.println("No");
    }
    }   
    
}
