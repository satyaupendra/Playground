import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner se = new Scanner(System.in);
      int base = se.nextInt();
      int exp = se.nextInt();
      long result = 1L;
      while(exp!=0)
      {
        result *= base;
        --exp;
      }
      System.out.println(result);
    }
}