package chapter3;
/* 3B
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize values we know
        int quota = 10;
        //Get unknown values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sales you made this week: ");
        int sales = scanner.nextInt();
        scanner.close();
        //Make a decision on the path to take - Output
        if(sales >= 10){
            System.out.println("Congrats! You've met your quota");
        }else{
            int saleShort = quota - sales;
            System.out.println("You did not make your quota. You were " +saleShort+ " sales short");
        }
    }
}
