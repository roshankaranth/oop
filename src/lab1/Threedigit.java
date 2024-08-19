package lab1;

public class Threedigit {
    public static void main(String[] args) {
        int fourDigitNumber = Integer.parseInt(args[0]);
        int[] digits = new int[4];
        int m = 0;
        while(fourDigitNumber>0){
            digits[m] = fourDigitNumber%10;
            fourDigitNumber/=10;
            m++;
        }


        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                if(j==i) continue;
                for(int k = 0 ; k < 4 ; k++){
                    if(k==i || k== j) continue;
                    int num = digits[i]*100 + digits[j]*10 + digits[k];
                    System.out.println(num);
                }
            }
        }
    }
}
