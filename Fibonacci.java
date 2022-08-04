package forloop;

public class Fibonacci {
    /*
    a   b   c
    0   1   1
    1   1   2
    1   2   3
    2   3   5
    3   5   8
    5   8   13
    8   13  21
     */
    public static void main(String[] args)
    {

        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=3; i<=10; i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
        System.out.println();

    }
}

