import java.util.*;
class Possrnegnum
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int i,n,num,psum=0,nsum=0;
  System.out.println("Enter the value of n");
  n=sc.nextInt();
  i=1;
  while(i<=n)
  {
  System.out.println("Enter the number");
  if(num>0)
  psum=psum+num;
  else
  nsum=nsum+num;
  }
  System.out.println("sum of positive and negative number");
  }
}
 