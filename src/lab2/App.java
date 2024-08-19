package lab2;

import java.util.*;

public class App{
  
    public static void main(String[] args) {

        String numStr1, numStr2;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter you first name ");
        numStr1 = in.next();
        System.out.println("Your name is " + numStr1);

        in.nextLine();

        System.out.println("Enter your surname");
        numStr2 = in.nextLine();
        System.out.println("Your surname is " + numStr2);

    }
}