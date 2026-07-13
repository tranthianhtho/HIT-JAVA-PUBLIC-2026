import java.util.Scanner;
public class bangcuuchuong {
    public static void main(String[] args){
        //bang cuu chuong
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bang " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
        //tam giac dau sao
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //duyet mang
        int[] arr = {1, 2, 3, 4, 5};

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
