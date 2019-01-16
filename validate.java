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
public class validate 
{
     public static void main(String args[])
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        boolean f= true;
        try
        {
            double d = Double.parseDouble(s); 
        }catch(Exception e)
        {
            f=false;
        }
        if(f)
        {
            System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }
    
}
}
