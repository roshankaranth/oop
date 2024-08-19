package lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        System.out.println(n);
        double sumlr = 0.0;
        double sumrl = 0.0;
        for(double i = 1 ; i <= n ; i++){
            sumlr += (1/i);
            sumrl += (1/(n-i+1));
        }

        System.out.println("Left to right sum : " + sumlr);
        System.out.println("Right to left sum : " + sumrl);
        System.out.println("Difference between the sum : " + (sumlr-sumrl));
    }
}
