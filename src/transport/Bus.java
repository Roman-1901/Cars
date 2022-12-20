package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }


    @Override
    public String toString() {
        return "Данные автобуса: бренд: " + getBrand() + ", модель: " + getModel() + ", максимальаня скорость: " + getMaxSpeed() + ", цвет: " + getColor() + ", год выпуска: " + getYear() + ", страна: " + getCountry();
    }
}

