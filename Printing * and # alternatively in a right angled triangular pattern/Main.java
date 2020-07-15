import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int i= 0;
        for(int r =1 ; r <= n ; r++) {
            for(int c =1 ; c <= r ; c++) {
                if(i== 0) {
                    System.out.print("*");
                    i = 1;
                }
                else {
                    System.out.print("#");
                    i= 0;
                }
     
            }
            System.out.print("\n");
        }
       
    }
}