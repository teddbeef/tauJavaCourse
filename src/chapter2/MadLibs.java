package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        String season, adj;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite season: ");
        season = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        adj = scanner.nextLine();

        System.out.println("Enter a whole number: ");
        number = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + number + " cup of coffee");
    }
}
