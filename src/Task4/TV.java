package Task4;

public class TV {

    private String model;
    private int year;
    private int price;
    private int diagonal;
    private String manufacturer;


    public TV(String model, int year, int price, int diagonal, String manufacturer) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
