
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num, number, temp, total = 0;
        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println("Armstrong Number");
        else
            System.out.println( "Not a Armstrong Number");
    }
}