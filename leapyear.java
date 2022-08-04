package ifelse;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        System.out.println("enter year");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("year is leap year");
        else
            System.out.println("year is not leap year");
    }
}