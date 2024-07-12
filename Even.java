import java.util.*;
class Divisibleby5
{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("Enter the value of n");
  n=sc.nextInt();
  if(n%5==0)
  {
    System.out.println("Divisible by five");
  }
  else{
   System.out.println("not divisible by five");
  }
 }
}
