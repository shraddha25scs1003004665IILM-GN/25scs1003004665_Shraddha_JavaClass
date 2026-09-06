import java.util.Scanner;

public class CountOccurence 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                count++;
        }

        System.out.println("Occurrence = " + count);
    }
}
