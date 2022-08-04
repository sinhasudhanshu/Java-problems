package ifelse;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("enter side of triangle");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a > (b + c) || c > (b + a) || b > (a + c)) {
            System.out.println("Not a triangle");
            return;
        }
        int count = 0;
        if (a == b)
            count++;
        if (a == c)
            count++;
        if (b == c)
            count++;
        System.out.println("Correct  triangle ");
        if(count==3)
            System.out.println("Equilateral ");
        else
            if(count==1)
                System.out.println("Isosceles ");
            else
                System.out.println("Scalene ");

            if((a*a ==b*b + c*c) ||( b*b==a*a + c*c )|| (c*c==a*a + b*b))
                System.out.println("RHS ");




    }


}

