package arrays;

public class largest2element {
    public static void main(String[] args){
        int[] a={2,5,49,6,8,9};
         int max1,max2;
         if(a[0]>a[1])
         {
             max1=a[0];
             max2=a[1];
         }
         else
         {
             max1=a[1];
             max2=a[0];
         }
         for (int i=2;i<=a.length-1;i++)
         {
             if(a[i]>=max1)
             {
                 max2=max1;
                 max1=a[i];
                 continue;
             }
             if(a[i]>max2)
             {
                 max2=a[i];

                 continue;
             }

         }
         System.out.println(max1);
        System.out.println(max2);
    }
}
