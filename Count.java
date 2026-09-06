import java.util.Scanner;

public class Count 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        System.out.print("Enter N: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
