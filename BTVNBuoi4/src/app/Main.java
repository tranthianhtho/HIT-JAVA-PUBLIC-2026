package app;

import model.Toy;
import model.ElectronicToy;
import model.PlushToy;

public class Main {

    public static void main(String[] args) {

        // Tạo mảng kiểu Toy
        Toy[] toys = new Toy[3];

        // Đối tượng Toy thông thường
        toys[0] = new Toy(
                "T01",
                "Bộ xếp hình",
                200.0,
                10
        );

        // Đối tượng ElectronicToy
        toys[1] = new ElectronicToy(
                "T02",
                "Robot thông minh",
                800.0,
                5,
                12
        );

        // Đối tượng PlushToy
        toys[2] = new PlushToy(
                "T03",
                "Gấu bông Teddy",
                300.0,
                8,
                "Bông gòn"
        );

        // Duyệt mảng và in thông tin
        for (int i = 0; i < toys.length; i++) {

            toys[i].printInfo();
        }
    }
}