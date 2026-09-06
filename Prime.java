import java.util.Scanner;

public class Prime 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, flag = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
    }
}
