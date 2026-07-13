import java.util.Scanner;
public class nhapn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        long gt = 1;
        int tong = 0;

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
            gt = gt * i;
            if(i % 2 == 0){
                tong += i;
            }
        }
        System.out.println(n + "! = " + gt);
        System.out.println("Tong cua cac so chan tu 1 den n la: " +tong);
    }
}
