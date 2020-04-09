package Java_W1_Day_02_Vonglap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class TH_tinhtienlai {
    public static void main(String[] args) {
        double money, interestRate;
        int month;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your money that like loan: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months : ");
        month=scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage : ");
        interestRate= scanner.nextDouble();
        double totalInterest=0;
//         for ( int i=0; i<month;i++){ // vong lap for k co y nghia
            totalInterest=money*(interestRate/100)/12*month;
//         }
        System.out.println("Total interest : " + totalInterest);
    }
}
