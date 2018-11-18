/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guvi;
import java.util.*;
class number
{
    
    void t1(int a)
    {
    if (a>0)
    {
    System.out.println("Positive");
    }
    else if(a==0)
    {
        System.out.println("Zero");
    }
    else
    {
        System.out.println("Negative");
    }
        }
    
    
}
public class Test 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
       number num = new number();
       num.t1(n);
       
    }
}
