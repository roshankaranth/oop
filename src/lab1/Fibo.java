package lab1;

public class Fibo {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        float sum = 2.0f;
        System.out.print(a + " " +  b + " " );
        int n = Integer.parseInt(args[0]);
        for(int i = 0 ; i <  n-2 ; i++){
            int c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
            sum += c;
        }
        System.out.println();
        System.out.print("Avergae = " + sum/n);
    }
}
