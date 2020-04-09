package Java_W1_Day_02_Vonglap;

public class BT_hienthisonguyentonhohon100 {
    public static void main(String[] args) {
        int x=2;
        int count =0;
        while (x<100){
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
        }
        System.out.println("Tong co " +count+ " so nguyen tu tu 2-100");
    }
}
