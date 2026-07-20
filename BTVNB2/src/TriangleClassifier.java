import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("a = ");
    int a = Integer.parseInt(sc.nextLine());

    System.out.print("b = ");
    int b = Integer.parseInt(sc.nextLine());

    System.out.print("c = ");
    int c = Integer.parseInt(sc.nextLine());

    if (a + b > c || a + c > b || b + c > a){
        if(a == b && b == c){
            System.out.println("Đây là tam giác đều.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Đây là tam giác cân.");
        } else{
            System.out.println("Đây là tam giác thường.");
        }
        double p = (a + b + c)/2.0;
        System.out.println("Chu vi của tam giác đó là: " + p);
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Diện tích của tam giác đó là: %.2f" ,S);
    }else {
        System.out.println("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ.");
        }
    }
}
