import java.util.Scanner;
public class hinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextInt();
        double rong = sc.nextInt();

        System.out.println("Chieu dai hinh chu nhat la: " +dai);
        System.out.println("Chieu rong hinh chu nhat la: " +rong);

        double chuvi = (dai + rong) * 2;
        double dientich = dai * rong;

        System.out.println("Chu vi hinh chu nhat la: " +chuvi);
        System.out.println("Dien tich hinh chu nhat la: " +dientich);
    }
}

