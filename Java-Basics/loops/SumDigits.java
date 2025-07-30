import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        int Num, sum = 0;

        System.out.println("ENTER NUMBER :");
        Scanner obj = new Scanner(System.in);
        Num = obj.nextInt();

        while (Num > 0) {
            int digit = Num % 10;   // Get last digit
            sum += digit;          // Add digit to sum
            Num = Num / 10;        // Remove last digit
        }

        System.out.println("SUM OF DIGITS: " + sum);
    }
}
