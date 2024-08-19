package lab2;

import java.util.Scanner;

class TaxOnSalary{
    
    private double salary;
    boolean isPANsubmitted;

    public TaxOnSalary(boolean isPANsubmitted){
        this.isPANsubmitted = isPANsubmitted;
        this.salary = 1000.0;
    }

    public TaxOnSalary(){
        this.isPANsubmitted = false;
        this.salary = 0.0;
    }

    public double getSalary(){
        return salary;
    }

    public boolean getIsPANsubmitted(){
        return isPANsubmitted;
    }

    public double calculateTax(){
        
        if(salary<=180000 && isPANsubmitted){
            return 0;
        }else if(salary<=180000 && !isPANsubmitted){
            return 0.05*salary;
        }else if(salary<=500000 && salary>180000){
            return 0.1*salary;
        }else if(salary<=1000000 && salary>500000){
            return 0.2*salary;
        }else{
            return 0.3*salary;
        }
    }

    public void inputSalary(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter salary : " );
        salary = in.nextDouble();
    }

}

public class TestTax {

    public static void main(String[] args) {

        TaxOnSalary tax1 = new TaxOnSalary(true);
        TaxOnSalary tax2 = new TaxOnSalary();

        tax1.inputSalary();
        tax2.inputSalary();


        System.out.println("Tax on tax1 : " + tax1.calculateTax());
        System.out.println("Tax on tax2 : " + tax2.calculateTax());
    }


}
