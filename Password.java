import java.util.Scanner;

public class Password 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int length = password.length();

        if (length < 8)
            System.out.println("Password is too short");
        else if (length <= 11)
            System.out.println("Password is acceptable");
        else
            System.out.println("Password is strong");
    }
}
