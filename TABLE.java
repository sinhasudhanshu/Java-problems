package forloop;

import java.util.Scanner;

public class TABLE {
    public static void main(String[] args)
    {
        int a;
        System.out.println("enter number ");
        Scanner s=new Scanner(System.in);
         a=s.nextInt();

        for (int i=1; i<=10; i++)
        {
            System.out.println(a*i);
        }

    }
}
