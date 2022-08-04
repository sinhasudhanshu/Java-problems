package forloop;

import java.util.Scanner;

public class numbertoword {
    public static void main(String[] args) {
        int n, a = 456;
        String output = "";
        while (a > 0) {
            n = a % 10;
            a = a / 10;
            switch (n) {
                case 0: {
                    output = "zero" + output;
                    break;
                }
                case 1: {
                    output = "one " + output;
                    break;
                }
                case 2: {
                    output = "two " + output;
                    break;
                }
                case 3: {
                    output="three " + output;
                    break;
                }
                case 4: {
                    output="four " + output;
                    break;
                }
                case 5: {
                    output="five " + output;
                    break;
                }
                case 6: {
                    output="six " + output;
                    break;
                }
            }
        }
            System.out.println(output);

    }
}
