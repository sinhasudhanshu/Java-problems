package arrays;

public class arrayminimum {
    public static void main(String[] args) {
        int[] a = {1, 2, 8, 5, 3, 4, 7};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(" minimum element" + min);

    }
}
