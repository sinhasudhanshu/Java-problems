package forloop;

public class drawing6 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("0");
            }
            for (int k = 1; k <= i * 2 - 2; k++) {
                System.out.print(" ");
            }
            for (int l=i;l<=n;l++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}