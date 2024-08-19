package lab2;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException{
        String s;
        InputStreamReader irs = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(irs);

        System.out.println("Please eneter 10 numbers : ");
        s = br.readLine();

        int[] num = new int[10];

        for(int i = 0 , j = 0, k = 0;  j < s.length() && i < s.length();){
            while(j+1!=s.length() && s.charAt(j+1)!= ' '){
                j++;
            }
            num[k] = Integer.parseInt(s.substring(i, j+1));
            i = j+2;
            j = i;
            k++;
        }

        int sum  = 0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }

        System.out.println(sum);

    }
}
