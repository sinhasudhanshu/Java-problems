package ifelse;

import java.util.Scanner;

public class AMPM {
    public static void main(String[] args) {
        int hour, min;
        System.out.println("Enter time");
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        min = sc.nextInt();
        if (hour <=11) {
            System.out.println(hour + ":"  + min + " am");
        }
        else if(hour==12) {
            System.out.println(hour + ":"  + min + " pm");

        }
        else
        {
            System.out.println((hour-12) + ":"  + min + " pm");
        }
    }


}
