import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = ob.next(); 

        String reversedNum = new StringBuilder(num).reverse().toString(); 

        if (num.equals(reversedNum)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
