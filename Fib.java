import java.util.*;
class FibanoccieNumbers
{
     public static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);
     int a=0,b=1,c,n=10;
     System.out.print(a+" "+b);
     for(int i=3; i<=10; i++)
     {
     c=a+b;
     System.out.println(" "+c);
     a=b;
     b=c;
     }
    }
}
