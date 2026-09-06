package phase01_Java_Fundamentals;

import java.util.Scanner;

public class userInputAndValidation {
    public static void main(String[] args) {
        String Username;
        int Age;
        String Email;
        String Password;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username: ");
        Username = sc.nextLine();
        System.out.println("Enter your age: ");
        Age = sc.nextInt();
        System.out.println("Enter your email: ");
        Email = sc.nextLine();
        System.out.println("Enter your password: ");
        Password = sc.nextLine();


    }
}
