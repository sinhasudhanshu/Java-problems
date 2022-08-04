package ifelse;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println(" no equation ");
            return;
        }
        if (a == 0) {
            System.out.println("answer = " + (-c / b));
            return;
        }
        double d = b * b - 4 * a * c;
        if (d >= 0) {
            d = Math.sqrt(d);
            double x1 = (-b + d) / (2 * a);
            double x2 = (-b - d) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
            return;
        }
        d = Math.sqrt(-d);
        double rp = -b / (2 * a);
        double ip = d / (2 * a);
        System.out.println(rp + " + j X " + ip);
        System.out.println(rp + " - j X " + ip);
    }

}
