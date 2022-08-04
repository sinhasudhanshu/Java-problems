package ifelse;

public class MultipleMax {

    public static void main(String[] args)
    {
        int a=1,b=9,c=7;
        int max=a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        System.out.println(max);
    }

}
