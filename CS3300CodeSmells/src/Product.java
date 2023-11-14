public class Product {
    private String name;
    private Dimensions dimensions;
    private Manufacturer manufacturer;
    private double price;
    public Product(String name, Dimensions dimensions, double price, Manufacturer manufacturer) {
        this.name = name;
        this.dimensions = dimensions;
        this.price = price;
        this.manufacturer= manufacturer;
    }
    public double getPrice() {
        return this.price;
    }
}
class Dimensions{
    private int length;
    private int width;
    private int height;
    Dimensions(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
class Manufacturer{
    private String manufacturerName;
    private String manufacturerAddress;
    Manufacturer(String manufacturerName, String manufacturerAddress){
        this.manufacturerName = manufacturerName;
        this.manufacturerAddress = manufacturerAddress;
    }
}
