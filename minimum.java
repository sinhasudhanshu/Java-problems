import java.util.Scanner;

public class minimum {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a= scanner.nextInt(),b= scanner.nextInt(),c= scanner.nextInt();
        int min;
        if( a<=b)
        {
            if(a<=c)
            {
                min=a;
            }
            else
            {
                min=c;
            }
        }
        else
        {
            if(b<=c)
            {
                min=b;
            }
            else
            {
                min=c;
            }
        }
        System.out.println(min);




    }
}

