package Java_W1_Day_02_Vonglap;

import java.util.Scanner;

public class BT_hienthi20songuyendautien {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap vao so luong so nguyen to can in ra : ");
        int n = scanner.nextInt();
        int count =0;
        int x =2;
        while (count<n){
            int i=2;
            boolean check = true;
            while (i<=Math.sqrt(x)){
                if (x%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(x);
                x++;
                count++;
            } else {
                x++;
            }
//            if (count==n){
//                break;
//            }

        }
        
    }
}
