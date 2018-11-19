/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;
import java.util.*;

public class Valid 
{
    public static void main(String[] args) 
    {
     
     Scanner sc = new Scanner(System.in);
     System.out.println("enter num");
     int n = sc.nextInt();
      if(n%2==0)
       {
           System.out.println("even");
       }
       else
       {
           System.out.println("Odd");
       }
    }
}
