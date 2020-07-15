import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      	Scanner in=new Scanner(System.in);
            int n= in.nextInt();
int s=0;
      while(n>0){
        int r=n%10;
        s=s+r;
        n=n/10;
	}
      System.out.print(s);
}
}