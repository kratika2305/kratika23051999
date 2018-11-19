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
public class leap 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter year");
        int n = s.nextInt();
        if((n%4==0 && n%100!=0)|| (n%400==0))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
    

