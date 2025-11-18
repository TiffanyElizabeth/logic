package exercises.PosOrNeg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert a number");
        int x = input.nextInt();

        String result = PosOrNeg.PositiveOrNegative(x);
        System.out.println("The number you gave is " + result);
        input.close();

    }
}
