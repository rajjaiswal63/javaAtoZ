package phase01_Java_Fundamentals;

import java.util.Scanner;

public class userInputAndDataConversion01 {
    public static void main(String[] args) {
        int Age;
        double Height;
        char Initial;
        boolean Isactive;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your age: ");
        Age = sc.nextInt();
        System.out.println("Enter your height: ");
        Height = sc.nextDouble();
        System.out.println("Enter your Initial: ");
        Initial = sc.next().charAt(0);
        Isactive =true;

        Integer age=Age;
        Double height=Height;

        int age2=age+5;
        double height2=height;
        String age3="my age is "+ age2;

        System.out.println("Age : "+ Age);
        System.out.println("Age after 5 years : "+ age2);
        System.out.println("Height : "+ height2 + "cm");
        System.out.println("Initial :" + Initial);
        System.out.println("Is active : "+ Isactive);

    }
}
