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
public class multiple_of7
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n");
    int n= sc.nextInt();
    if(n%7==0)
        System.out.println("yes");
    else
        System.out.println("no");
    }
}
