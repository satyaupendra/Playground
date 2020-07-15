import java.util.Scanner;
class Main{
  public static int d(int b,int e)
  {
    int r=1;
    for(int i=1;i<=e;i++)
    {
      r=r*b;
    }
    return r;
  }
  public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        int f =in.nextInt();
    System.out.println(d(n,f));
  }
}
	    // Take numbers from 2 to given number
	    // Check each number until it reaches the given number
	   