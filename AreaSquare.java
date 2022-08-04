package basics;

import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter A");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        int area = a * a;
        double diagonal = Math.sqrt(a * a + a * a);
        System.out.println(area);
        System.out.println(diagonal);

    }

}
