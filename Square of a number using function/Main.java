import java.util.Scanner;
class Main
{
 public static  int s(int n)
  {
   int d=n*n;
 return d;
  }
   
	public static void main (String[] args)
    {
	 // Type your code here 
       
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      System.out.println(s(n));
      
      
	} 
}