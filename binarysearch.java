package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class binarysearch {
    public static void main(String[] args) {
        int b;
        int[] a = {1, 2, 4, 8, 7, 9, 12};
        int left = 0, right = a.length - 1;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

        while (true) {
            int mid = (left + right) / 2;
            if (a[mid] == b) {
                System.out.println("found " + (mid));
                return;
            }
            if (b < a[mid])
                right = mid - 1;
            else
                left = mid + 1;

            if (left > right) {
                System.out.println("Not found");
                return;
            }
        }

    }

}
