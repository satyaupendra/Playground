import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int s=0;
      int f;
        f=n%10;
       while(n>10){ n=n/10;}
      
	s=f+n;
      System.out.println(""+s);
}}