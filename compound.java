package basics;

public class compound {
    public static void main(String[] args) {
        int p=1200, r=5, t=5;
        double si=(p*r*t)/100.0;
        double ci=p*Math.pow(1 + r/100.0,t)-p;
        System.out.println(si);
        System.out.println(ci);
//System.out.println(Math.sqrt(100));
//System.out.println(Math.pow(2,5));

    }

}