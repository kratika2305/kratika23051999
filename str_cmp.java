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
public class str_cmp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s1");
        String s1 = sc.nextLine();
        System.out.println("enter s2");
        String s2 = sc.nextLine();
        int l1=s1.length();
        int l2=s2.length();
        int k = 0,c=0,c1=0;
        if(l1>l2)
        {
        System.out.println(s1);
        }
        else if(l1<l2)
        {
        System.out.println(s2);
        }
        
        else
        {
        for(int i=0;i<l1&&i<l2;i++)
        {
            int s11 = (int)s1.charAt(i);
            int s22 = (int)s2.charAt(i);
            c=c+s11;
            c1=c1+s22;
//            if(s11==s22)
//            {
//                System.out.println(s1);
//            }
//            else if(s11>s22)
//            {
//                 c++;
//            }  
//            else
//            {
//                c1++;
//            }
          
        }
        if(c==c1)
        {
            System.out.println(s1);
        }
        else if(c>c1)
        {
      
System.out.println(s1);     
        }
        else
        {
            System.out.println(s2);
        }
    }
    }
    
}
