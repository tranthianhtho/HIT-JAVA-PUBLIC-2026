package model;

public class PlushToy extends Toy {

    private String material;

    // Constructor
    public PlushToy(String id, String name, double price,
                    int quantity, String material) {

        super(id, name, price, quantity);
        this.material = material;
    }

    // Getter
    public String getMaterial() {
        return material;
    }

    // Setter
    public void setMaterial(String material) {
        this.material = material;
    }

    // Override calculateDiscount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    // Override printInfo
    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Chất liệu: " + material);
        System.out.println("Số tiền được giảm: " + calculateDiscount());
    }
}