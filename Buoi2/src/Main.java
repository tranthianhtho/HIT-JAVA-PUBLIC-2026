import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt();
        int rong = sc.nextInt();

        System.out.println("Chieu dai hinh chu nhat la: " +dai);
        System.out.println("Chieu rong hinh chu nhat la: " +rong);

        int chuvi = (dai + rong) * 2;
        int dientich = dai * rong;

        System.out.println("Chu vi hinh chu nhat la: " +chuvi);
        System.out.println("Dien tich hinh chu nhat la: " +dientich);

        sc.close();
    }
}