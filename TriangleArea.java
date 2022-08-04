package basics;

import java.util.Scanner;

public class TriangleArea
{
    public static void main(String[] args)
    {
        int a,b,c;
        System.out.println("Enter sidws");;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
