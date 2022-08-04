import java.util.Scanner;

public class twomin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int min;//If else ladder
        if (a <= b && a <= c)
            min = a;
        else if ( b<=c)
            min = b;
        else
            min = c;
        System.out.println(min);
    }
}
