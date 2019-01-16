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
public class time 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter time in minutes");
        int i = s.nextInt();
        

        int h=i/60;
        int h1=h*60;
        int m1 = i-h1;
        System.out.println(h+" "+m1);
    }
    
}
