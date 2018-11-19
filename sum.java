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
public class sum 
{
    public static void main(String[] args) 
    {Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int N= sc.nextInt();
        int s=0;
        
        for(int i =0;i<=N;i++)
        {
            s=s+i;
            
        }
        System.out.println(s);
      
    }
    
}
