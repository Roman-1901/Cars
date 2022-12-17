import transport.Car;

public class Main {
    public static void main(String[] args) {
 //       Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car granta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "  ", "седан", "а336вщ023", 5, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "хэтчбэк", "у927сс030", 5, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автомат", "седан", "н057рк050", 5, true);
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(hyundai);
        hyundai.setCarTyre(1);
        System.out.println(hyundai.getCarTyre());
        System.out.println(hyundai.checkNum());
        System.out.println(granta.checkNum());
    }

}
