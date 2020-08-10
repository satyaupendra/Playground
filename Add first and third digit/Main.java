import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     int f=(n/100);
      int t=n%10;
       
      int s= f+t;
      System.out.println(s);
	}
}
//commit
