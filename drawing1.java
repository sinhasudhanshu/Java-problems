package forloop;

public class drawing1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<=n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }

}
