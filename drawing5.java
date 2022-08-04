package forloop;

public class drawing5 {
    public static  int pascal(int y,int x)
    {
        if(x==1)
            return  1;
        if(x==y)
            return 1;
        return  pascal(y-1,x)+ pascal(y-1,x-1);
    }
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<=n-1; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print( pascal(i,j) +  " ");
            }
            System.out.println();
        }
    }
}

