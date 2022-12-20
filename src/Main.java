import transport.Bus;
import transport.Car;
import transport.Transport;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //       Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car granta = new Car("Lada", "Granta", 1.7, 150,"желтый", 2015, "Россия", "  ", "седан", "а336вщ023", 5, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, 200,"черный", 2020, "Германия", "автомат", "хэтчбэк", "у927сс030", 5, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, 250,"оранжевый", 2016, "Южная Корея", "автомат", "седан", "н057рк050", 0, true);
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(hyundai);
        System.out.println();
        System.out.println("Резина у Хендай - " + hyundai.getCarTyre());
        hyundai.setCarTyre(1); // смена резины по указанию номера месяца
        System.out.println("Резина после смены месяца у Хендай - " + hyundai.getCarTyre());
        System.out.println();
        System.out.println("Проверка номера у Ауди "+ audi.getRegNumber() +", - " + audi.checkNum()); // проверка номера выдаст true
        System.out.println("Проверка номера у Лады Гранта " + granta.getRegNumber() + ", - " + granta.checkNum()); // проверка номера выдаст false, так как номер некорректен, имеется российская буква, отсутсвующая в латинской раскладке
        System.out.println();

        //Класс Key
        audi.setKey(audi.new Key(true, true));
        System.out.println(audi);
        System.out.println();

        //Страховка
        Car.Insurance hyundaiInsurance = new Car.Insurance(365, 5000.00, 449622939);
        hyundai.setInsurance(hyundaiInsurance);
        hyundai.setKey(hyundai.new Key(true, false));
        System.out.println(hyundai);
        System.out.println(hyundaiInsurance.checkInsuranceNum()); // проверка номера страховки

        System.out.println();
        Car.Insurance grantaInsurance = new Car.Insurance(-10, 0, 4568);
        granta.setInsurance(grantaInsurance);
        System.out.println(granta);
        System.out.println(grantaInsurance.checkInsuranceNum()); // проверка номера страховки

        // Автобусы
        System.out.println();
        Bus[] bus = new Bus[3];
        bus[0] = new Bus("Citroen", "Jumper", "черный", 2021, "Германия", 180);
        bus[1] = new Bus("Mercedes-Benz", "Sprinter", "синий", 2022, "Франция", 200);
        bus[2] = new Bus("Лиаз", "4292", "зеленый", 2019, "Россия", 130);

        System.out.println("Автобусы:");
        for (int i = 0; i < bus.length; i++) {
            System.out.println(bus[i]);
        }
    }

}
