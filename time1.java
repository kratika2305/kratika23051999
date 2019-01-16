/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

import java.util.Scanner;
import java.lang.Math.*;
import static java.lang.Math.abs;
/**
 *
 * @author hp
 */
public class time1 
{
     public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter time1");
        int h1 = s.nextInt();
         int m1 = s.nextInt();
           System.out.println("enter time2");
        int h2 = s.nextInt();
         int m2 = s.nextInt();
         int h=abs(h1-h2);
         int m = abs(m1-m2);
          System.out.println(h+" "+m);
    }
    
}
