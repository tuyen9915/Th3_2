import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Khai báo tiền gửi, số tháng gửi, lãi suất
        double tien ;
        int thang ;
        double lai ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        tien = sc.nextDouble();
        System.out.print("Nhâp số tháng gửi: ");
        thang = sc.nextInt();
        System.out.print("Nhập lãi: ");
        lai =  sc.nextDouble();

        double tonglai = 0;
        for( int i = 0; i < thang; i ++){
            tonglai += tien * (lai / 100 )/12  * thang ;
        }
        System.out.println(" Tổng lãi :" + tonglai);

    }
}