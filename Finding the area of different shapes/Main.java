import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner se = new Scanner(System.in);
      int i = se.nextInt();
      switch(i)
      {
        case 1:
             int side = se.nextInt();
             System.out.println(side*side);
          break;
        case 2:
              int l = se.nextInt();
              int b = se.nextInt();
              System.out.println(l*b);
          break;
        case 3:
              int bs = se.nextInt();
              int h = se.nextInt();
              int j = (bs*h)/2;
              System.out.println(j);
          break;
        case 4:
              int r = se.nextInt();
              System.out.println(3.14*r*r);
          break;
      }
          
          
    }
}