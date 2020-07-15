import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
        int n1 =in.nextInt();
        int n2 =in.nextInt();
        int n3 =in.nextInt();
      System.out.println(hcf(n1,n2,n3));
	}
  public static int hcf(int a,int b,int c)
  {
    int min=0,r=0;
    if(a<b&&a<c)
    {
      min=a;
    }
    else if(b<a&&b<c)
    {
      min=b;
    }
    else if(c<a&&c<b)
    {
      min=c;
    }
    for(int i=min;i>=1;i--)
    {
      if(a%i==0&&b%i==0&&c%i==0)
      {
         r=i;
        break;
      }
     
    }
     return r;
  }
    
    
}