mport java.util.*;
class Factorialofnumbers
{
     public static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);
     int n=6;
     int fact=1, i;
     for(i=1; i<=n; i++)
     {
        fact=fact*i;
        }
     System.out.print(fact);
     }
  }
}