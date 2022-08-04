package ifelse;

import java.util.Scanner;

public class currency {
    public static void main(String[] args)
    {
        int paisa;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the amount  ");
        int rs = sc.nextInt();
        int p = sc.nextInt();
        paisa= rs*100 + p;
        String sign="";
        if(paisa<0)
        {
            paisa=-paisa;
            sign="-";
        }
        rs=paisa/100;
        p=paisa%100;
        String strrupee,strpaise;
        if(rs<10)
            strrupee="0" + rs;
        else
            strrupee="" + rs;
        if(p<=9)
            strpaise="0" + p;
        else
            strpaise="" + p;
        System.out.println(sign + "₹ " + strrupee + "." + strpaise);

    }


}
