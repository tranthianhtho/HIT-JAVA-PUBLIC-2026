import java.util.Scanner;

public class PointDistance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("x1 = ");
        int x1 = Integer.parseInt(sc.nextLine());

        System.out.print("y1 = ");
        int y1 = Integer.parseInt(sc.nextLine());

        System.out.print("x2 = ");
        int x2 = Integer.parseInt(sc.nextLine());

        System.out.print("y2 = ");
        int y2 = Integer.parseInt(sc.nextLine());

        double d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
        System.out.print("Khoảng cách giữa hai điểm A và B là: " + d);
    }
}
