package ifelse;

import java.util.Scanner;

public class TwoMax {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numberz");
        int a= scanner.nextInt(),b= scanner.nextInt();
        int max;
        if(a>=b)
            max=a;
        else
            max=b;
        System.out.println(max);
    }
}
