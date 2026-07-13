import java.util.Scanner;
public class daonguocvasodoixung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen: ");
        int n = sc.nextInt();

        int temp = n;
        int daonguoc = 0;
        while(temp != 0){
            daonguoc = daonguoc * 10 + temp % 10;
            temp = temp/10;
        }
        System.out.println("So dao nguoc la: " +daonguoc);

        if(daonguoc == n){
            System.out.println("La so doi xung.");
        }
        else{
            System.out.println("Khong phai la so doi xung.");
        }
    }
}
