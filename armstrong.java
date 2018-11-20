/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author hp
 */
public class armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int n= sc.nextInt();
        int c=0,s=0;
        int m=n;
        int n1=n;
        while(n1!=0)
        {
        
            n1=n1/10;
            c++; 
       
        }
//            System.out.println(c);
        
        while(n!=0)
        {
            int r = n%10;
            s = s + ((int)Math.pow(r,c));
            n=n/10;
            
        }
        if(m==s)
        {
            System.out.println("yes");
        }
        else
        {
        System.out.println("no");
        }      
    } 
    
}
