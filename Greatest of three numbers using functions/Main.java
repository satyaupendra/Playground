import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n1 =in.nextInt();
        int n2=in.nextInt();
        int n3 =in.nextInt();
      System.out.println(g(n1,n2,n3));
	}
                         public static int g(int a,int b,int c)
                         {
                           int result=0;
                           if(a>b&&a>c)
                           {
                              result =a;
                           }
                           else if(b>c)
                           {
                             result=b;
                           }
                           else if(c>b)
                           {
                          result =c;
                           }
                           return result;
                         }
                         
}