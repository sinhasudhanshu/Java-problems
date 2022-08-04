package basics;

import java.util.Scanner;

public class arearectecngle {
    public static void main(String[] args) {

        int l, b;
        System.out.println("Enter A");
        Scanner sc = new Scanner(System.in);
        l= sc.nextInt();
        b= sc.nextInt();
        int area=l*b;
        double diagonal = Math.sqrt(l * b + l * b);
        System.out.println(area);
        System.out.println(diagonal);


    }
}
