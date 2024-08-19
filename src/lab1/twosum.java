package lab1;


import java.util.Arrays;
public class twosum {
    public static void main(String[] args) {
        int X = Integer.parseInt(args[0]);
        int[] array = new int[args.length-1];

        for(int i = 1 ; i < args.length; i++){
            array[i-1] = Integer.parseInt(args[i]);
        }

        Arrays.sort(array);
        int i = 0 ;
        int j = array.length-1;
        while(i<=j){
            if(array[i]+array[j]==X){
                System.out.println(array[i] + " " + array[j]);
                i++;
                
            }else if(array[i]+array[j]>X) j--;
            else i++;
        }

    }
}
