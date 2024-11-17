package chapter3;

import java.util.Scanner;

/* 3F
 * LOGICAL OPERATORS
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorsLoanQualifier {
    public static void main(String[] args) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we don't
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if(salary >= requiredSalary && years >= requiredYears){
            System.out.println("Congrats! You qualify for this loan");
        }else{
            System.out.println("Sorry, you must earn at least $" + requiredSalary +
                    " and have been working at your current job at least " + requiredYears + " years to qualify for the loan");
        }
    }
}
