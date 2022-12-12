public class Car {
    final String brand;
    final String model;
    final double engineVolume;
    String color;
    final int year;
    final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
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
