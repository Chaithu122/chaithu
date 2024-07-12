import java.util.*;
class Test
{
  public static void main(String args[])
  {
  System.out.println("application Starts");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int num=sc.nextInt();
  try{
  System.out.println(10/num);
  }
  catch(Arithmetic Exception ae)
  {
  System.out.println("Given zero check once.."+ae);
  }
  System.out.println("Rest of Application");
  }
}

   