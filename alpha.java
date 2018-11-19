package guvi;
import java.util.*;

public class alpha 
{
  public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter string");
     char  n = sc.next().charAt(0);
    
    if ((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
      {
          if(n == 'a' || n=='A' || n=='e' || n=='E' || n=='i' || n=='I' || n=='o' || n=='O' || n=='u' || n=='U')
          {
              System.out.println("Vowel");
          }
          else
          {
              System.out.println("Consonant");
          }
      }
    else
    {
        System.out.println("Invalid");
    }
    }   
}
