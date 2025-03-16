import java.util.Scanner;

public class sumofdigit{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = ob.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }
        System.out.println("Sum of digits: " + sum);
    }
}
/*
--If you want to take input number more than 10 length :-

import java.math.BigInteger;
import java.util.Scanner;

public class bigbigsumofdigit {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = ob.nextLine();

        BigInteger num = new BigInteger(input);
        int sum = 0;

        for (char c : input.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        System.out.println("Sum of digits: " + sum);
    }
}
*/
