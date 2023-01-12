package day30_inheritance.phoneTask;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, String color, double price) {
       setBrand(brand);
       setModel(model);
       setSize(size);
       setColor(color);
       setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0) {
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White") ||
        color.equalsIgnoreCase("Silver") || color.equalsIgnoreCase("Gold") ||
        color.equalsIgnoreCase("Pink")) {
            this.color = color;
        }
        else {
            System.err.println("Wrong Color");
            System.exit(1);
        }

    }

    public void call (long phoneNumber) {
        System.out.println(getModel()+" is calling "+phoneNumber);
    }

    public void text (long phoneNumber) {
        System.out.println(getModel()+" is texting to "+phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
