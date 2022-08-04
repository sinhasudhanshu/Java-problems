import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int mid;
        if ((a <= b) && (a >= c) || (a >= b && a <= c))
            mid = a;
        else if ((b >= a) && b <= c || (b <= a && b >= c))
            mid = b;
        else
            mid = c;
        System.out.println(mid);
    }
}
