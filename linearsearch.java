package arrays;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int b;
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("found");
                return;
            }
        }

        System.out.println("not found");
    }
}

