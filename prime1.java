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
public class prime1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N <=1000");
        int n= sc.nextInt();
         System.out.println("enter Q<=1000");
        int q = sc.nextInt();
         int  count,i,j;
    
     for(i=n;i<=q;i++)
      {
          if(i!=n && i!=q)
          {
         count = 0;
      for(j=2;j<=i/2;j++)
      {
    if (i % j == 0) 
    {
     count++;
     break;
    }
   }

   if (count == 0) {
    System.out.println(i+" ");
   }

  }
 }
}
}

