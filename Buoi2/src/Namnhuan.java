import java.util.Scanner;
public class Namnhuan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int nam = sc.nextInt();

        if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
            System.out.println(nam + " là năm nhuận.");
        }
        else{
            System.out.println(nam + " không phải là năm nhuận.2024");
        }
    }
}
