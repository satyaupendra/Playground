import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=0;
      for(int i=1;n>c;i++)
      {
       if(i%2==1)
       {
       System.out.println(""+i);  
              c=c+1; 
       }
       
      }
          
	}
}