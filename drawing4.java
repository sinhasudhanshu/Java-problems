package forloop;

public class drawing4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >=2; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
              System.out.print("0");
            }
            System.out.println();
        }
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <=n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
