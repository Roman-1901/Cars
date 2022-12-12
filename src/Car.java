public class Car {
    final String brand;
    final String model;
    final double engineVolume;
    String color;
    final int year;
    final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        if (year <= 0) {
            year = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Данные автомобиля: бренд: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color + ", год выпуска: " + year + ", страна: "+ country + ".";
    }
}
