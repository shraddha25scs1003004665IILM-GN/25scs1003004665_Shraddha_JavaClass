import java.util.Scanner;

public class Reverse 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, rev = 0, rem;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);
    }
}
