package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
        String def = "default";
        if (brand == null || brand.isBlank()) {
            brand = def;
        }
        if (model == null || model.isBlank()) {
            model = def;
        }
        if (country == null || country.isBlank()) {
            country = def;
        }
        if (year <= 0) {
            year = 2000;
        }
        this.brand = brand;
        this.model = model;
        setColor(color);
        this.year = year;
        this.country = country;
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 200;
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public abstract String toString();
}
