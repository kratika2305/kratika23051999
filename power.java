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
public class power 
{
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int n= sc.nextInt();
        System.out.println("enter m");
        int m= sc.nextInt();
        int k = (int) Math.pow(n,m);
        System.out.println(k);
        
    }
    
}
