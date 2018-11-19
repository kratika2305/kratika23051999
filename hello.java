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
public class hello
{
    public static void main(String[] args) 
    {Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N= sc.nextInt();
        
        for(int i =1;i<=N;i++)
        {
            System.out.println("Hello");
        }
      
    }
    
}
