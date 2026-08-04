package model;

public class Toy {
        private String id;
        private String name;
        private double price;
        private int quantity;

        // Constructor
        public Toy(String id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            setPrice(price);
            setQuantity(quantity);
        }

        // Getter và Setter cho id
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        // Getter và Setter cho name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter và Setter cho price
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price <= 0) {
                System.out.println("Giá bán không hợp lệ!");
            } else {
                this.price = price;
            }
        }

        // Getter và Setter cho quantity
        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) {
                System.out.println("Số lượng không hợp lệ!");
            } else {
                this.quantity = quantity;
            }
        }

        // Phương thức tính giảm giá
        public double calculateDiscount() {
            return 0;
        }

        // In thông tin
        public void printInfo() {
            System.out.println("Mã: " + id);
            System.out.println("Tên: " + name);
            System.out.println("Giá: " + price);
            System.out.println("Số lượng: " + quantity);
    }
}
