package exercises.PasswordGenerator;

import java.util.Scanner;
import exercises.PasswordGenerator.PasswordGenerator;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine().toLowerCase();

        System.out.println("What is your last name?");
        String lastName = input.nextLine().toLowerCase();

        System.out.println("What is your favorite color?");
        String favoriteColor = input.nextLine().toUpperCase();

        System.out.println("What day of the month were you born on?");
        int birthDay = input.nextInt();

        System.out.println("Which month were you born in?");
        int birthMonth = input.nextInt();

        System.out.println("What year were you born in?");
        int birthYear = input.nextInt();

        System.out.println(PasswordGenerator.generatePassword(firstName, lastName, favoriteColor, birthDay, birthMonth,
                birthYear));
    }
}
