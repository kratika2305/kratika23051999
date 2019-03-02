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
public class str_con 
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s1");
        String s1 = sc.nextLine();
        String s2;
        int l1=s1.length();
      
//        for(int i=0;i<l1;i++)
//        {
//            int c =(int)s1.charAt(i);
//            if(c==32)
//            {
//                
//            }
//        }
        s2=s1.replaceAll(" ","");
        
       
        System.out.println(s2);
    }
    
}
