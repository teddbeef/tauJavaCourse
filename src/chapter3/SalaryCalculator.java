package chapter3;

import java.util.Scanner;

/* 3A
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/
public class SalaryCalculator {
    public static void main(String[] args) {
        //Initialize know values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        //Get values for the unknown
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sales did the employee make this week?: ");
        int sales = scanner.nextInt();
        scanner.close();
        //Quick detour for the bonus earners
        if (sales > quota) {
            salary += bonus;
        }
        //Output
        System.out.print("The employee's pay is: $" + salary);
    }
}
