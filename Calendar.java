/*Write a program that takes three integers: day, month, and year. Without using any built-in Calendar or Date libraries, validate the date
and print tomorrow's date in DD/MM/YYYY format.

        Conditions to handle via if-else:

        • Reject years less than 1 or months outside 1–12.

        • Accurately validate days in a month (30 vs 31 days).

        • Implement the full Gregorian leap year rule for February (28 vs 29 days): divisible by 4, except centuries unless divisible by 400.

        • Handle rollovers cleanly: end of month (30/04/2025 → 01/05/2025), February leap/non-leap rollovers (28/02/2024 → 29/02/2024), and end-of-year rollovers (31/12/2025 → 01/01/2026).

        • If the input date is invalid (e.g., 31/02/2024 or 29/02/2023), print "Invalid Date".*/

import java.util.Scanner;

public class Calendar {
    static void main() {
        Scanner month = new Scanner(System.in);
        System.out.print("enter the month number: ");
        int m = month.nextInt();

        Scanner day = new Scanner(System.in);
        System.out.print("enter the day number: ");
        int d = day.nextInt();

        Scanner year = new Scanner(System.in);
        System.out.print("enter the year number: ");
        int y = year.nextInt();

        if(y % 4 == 0 && y % 400 == 0 && y % 100 != 0){
            if(m == 2 && d>29){
                System.out.println("error try again");
            }
            if(m > 12 || m < 1 || d > 31 || d < 1){
                System.out.println("error try again");
            }
            else{
                System.out.printf("Date: %d/%d/%d\n", d, m, y);
                if(m == 2 && d == 29){
                    d = 1;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                if(m == 8 && d == 31){
                    d = 1;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                if(m == 12 && d == 31){
                    d = 1;
                    m = 1;
                    y++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                else if(m % 2 == 0 && d == 30){
                    d = 1;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                else if(m % 2 == 1 && d == 30){
                    d++;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                else{
                    System.out.printf("Tomorrow's date: %d/%d/%d", d+1, m, y);
                }
            }
        }
        else{
            if(m > 12 || m < 1 || d > 31 || d < 1){
                System.out.println("error try again");
            }
            if(m == 2 && d>28){
                System.out.println("error try again");
            }
            else{
                System.out.printf("Date: %d/%d/%d\n", d, m, y);
                if(m == 2 && d == 28){
                    d = 1;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                if(m == 8 && d == 31){
                    d = 1;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                if(m == 12 && d == 31){
                    d = 1;
                    m = 1;
                    y++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                else if(m % 2 == 0 && d == 30){
                    d = 1;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                else if(m % 2 == 1 && d == 30){
                    d++;
                    m++;
                    System.out.printf("Tomorrow's date: %d/%d/%d", d, m, y);
                }
                else{
                    System.out.printf("Tomorrow's date: %d/%d/%d", d+1, m, y);
                }
            }
        }
    }
}
