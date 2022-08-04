package basics;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter Number" );
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println(Math.max(a,b));
    }
}
