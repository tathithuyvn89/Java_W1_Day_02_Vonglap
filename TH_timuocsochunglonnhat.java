package Java_W1_Day_02_Vonglap;

import java.util.Scanner;

public class TH_timuocsochunglonnhat {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  : ");
        a=scanner.nextInt();
        System.out.println("Enter b :  ");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        int count=0;
        //Kiem tra a va b co bang 0 hay khong
        if (a==0||b==0){
            System.out.println("No greatest common factor");

        }
//        while ((a!=b)){
//            if (a>b){
//                a=a-b;
//            } else {
//                b=b-a;
//            }
//        }
//        System.out.println("Greatest common factor : " + a);
        else {
            if (a > b) {
                for (int i = 1; i <= b; i++) {
                    if (a % i == 0 && b % i == 0) {
                        count = i;
                    }
                }
            }
            if (a <= b) {
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        count = i;
                    }
                }
            }
            System.out.println("Uoc chung lon nhat cua 2 so la : " + count);
        }

    }
}
