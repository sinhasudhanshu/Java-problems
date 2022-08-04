package arrays;

public class arraysum {
    public static void main(String[] args)
    {
        int[] a={2,4,8,5,1,7,3};
        int sum = 0;
        for (int i=0; i< a.length; i++){
            sum +=a[i];
        }
        System.out.println("array sum " +sum);
    }
}
