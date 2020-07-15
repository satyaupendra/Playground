import java .util.*;
class Main{
  public static void main(String arg[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int r_n=1;r_n<=n;r_n++)
    {
      for(int c_l=1;c_l<=r_n;c_l++)
      {
        System.out.print(""+ r_n);
      }
      System.out.println("");
    }
  }
}