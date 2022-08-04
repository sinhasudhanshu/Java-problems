package forloop;

public class numpattern {
    public static void main(String[] args){
        int n=8;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print("");
            }
            for(int j=1; j<=i-1; j++){
                {
                    char ch =(char)('A' + j-1);
                    System.out.print(" " +ch);
                }
             //   System.out.print(" " +j);
            }
            System.out.println();
        }
    }
}
