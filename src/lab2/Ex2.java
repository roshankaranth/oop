package lab2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String ch;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        ch = in.next();

        System.out.println("You eneterd : " + (int)ch.charAt(0));

    }
}
