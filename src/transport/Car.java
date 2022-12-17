package transport;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.DAYS;


public class Car {

    public class Key {
       private boolean remoteEngStart;
       private boolean notKeyAccess;

        public Key(boolean remoteEngStart, boolean notKeyAccess) { //в данном случае я не вижу смысла делать проверку на пустоту значения,
            this.remoteEngStart = remoteEngStart;      //т.к. подобные параметры из пользовательского интерфейса обычно передаются в виде чекбокса, а не ручным вводом
            this.notKeyAccess = notKeyAccess;
        }

        public String getRemoteEngStart() {
            if (remoteEngStart) {
                return "Удаленный запуск двигателя имеется";
            } else {
                return "Удаленный запуск двигателя отсутствует";
            }
        }

        public String getNotKeyAccess() {
            if (notKeyAccess) {
                return "Бесключевой доступ имеется";
            } else {
                return "Бесключевой доступ отсутствует";
            }
        }

        @Override
        public String toString() {
            return getRemoteEngStart() + ", " + getNotKeyAccess();
        }
    }

    public static class Insurance {
        private int countDay;
        private final LocalDate expireDate;
        private double price;
        private int num;

        public Insurance(int countDay, double price, int num) {

            this.expireDate = LocalDate.now().plusDays(countDay);

            if (price == 0 || price < 0) {
                price = 1000.00;
            }
            this.price = price;

            if(num < 0) {
                num = Math.abs(num);
            }
            int lengthNum = (int)Math.log10(num) + 1;
            if (lengthNum != 9) {
                num = 0;
            }
            this.num = num;
        }

        public int getCountDay() {
           long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), expireDate);
           countDay = (int) daysBetween;
            return countDay;
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getPrice() {
            return price;
        }

        public int getNum() {
            return num;
        }

        public String checkInsurance() {
            int check = getCountDay();
            if (check > 0) {
                return "Страховка действующая";
            } else {
                return "Страховка просрочена, необходимо оформлять новую";
            }
        }

        public String checkInsuranceNum() {
            if (getNum() == 0) {
                return "Номер страховки некорректный";
            } else {
                return "Номер страховки корректный";
            }
        }

        @Override
        public String toString() {
            return "Дата окончания страховки " + expireDate + ", Цена " + price + ", Номер " + num + "\n"+
                    "Срок окончания страховки " + getCountDay() + " дней.\n"
                    + checkInsurance() + "\n"
                    + checkInsuranceNum();
        }
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int countSeat;
    private String carTyre;
    private boolean season;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String regNumber, int countSeat, boolean season) {
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
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (color == null || color.isBlank()) {
            color = "белый";
        }
        if (year <= 0) {
            year = 2000;
        }
        if (transmission == null || transmission.isBlank()) {
            transmission = "механика";
        }
        if (bodyType == null || bodyType.isBlank()) {
            bodyType = def;
        }
        if (regNumber == null || regNumber.isBlank()) {
            regNumber = "x000xx000";
        }
        if (countSeat < 2) {
            countSeat = 2;
        } else if (countSeat > 8) {
            countSeat = 8;
        }
        if (season == true) {
            this.carTyre = "летняя";
        } else {
            this.carTyre = "зимняя";
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.countSeat = countSeat;
        this.season = season;
        Car.Key keyTemp = new Key(false, false);
        this.key = keyTemp;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Механика";
        } else {
            this.transmission = transmission;
        }

    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank()) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public int getCountSeat() {
        return countSeat;
    }

    public String getCarTyre() {
        return carTyre;
    }

    public void setCarTyre(boolean season) {
        if (season == true) {
            this.carTyre = "летняя";
        } else {
            this.carTyre = "зимняя";
        }
    }

    public void setCarTyre(int month) {
        if (month > 4 && month < 11 || month < 1 || month > 12) {
            this.season = true;
        } else {
            this.season = false;
        }
        setCarTyre(this.season);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
            this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
            this.insurance = insurance;
    }

    private boolean checkLetter(String regNumber) {
        boolean check = false;
        regNumber = regNumber.toLowerCase();
        char[] letters = new char[]{'а', 'в', 'е', 'к', 'м', 'н', 'о', 'р', 'с', 'т', 'у', 'х'};
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == regNumber.charAt(0)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check) {
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == regNumber.charAt(4)) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
        }
        if (check) {
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == regNumber.charAt(5)) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
        }

        return check;
    }

    private boolean checkNumber(String regNumber) {
        boolean check = false;
        if (Character.isDigit(regNumber.charAt(1)) && Character.isDigit(regNumber.charAt(2)) && Character.isDigit(regNumber.charAt(3)) &&
                Character.isDigit(regNumber.charAt(6)) && Character.isDigit(regNumber.charAt(7)) && Character.isDigit(regNumber.charAt(8))) {
         check = true;
        }
        return check;
    }

    public boolean checkNum() {
        boolean check = false;
        boolean checkLetter = false;
        boolean checkNum = false;
        if (regNumber.length() == 9) {
            checkLetter = checkLetter(regNumber);
        }
        if (checkLetter) {
            checkNum = checkNumber(regNumber);
        }
        if (checkNum) {
            check = true;
        }
        return check;
    }


    @Override
    public String toString() {
        return "Данные автомобиля: бренд: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color + ", год выпуска: " + year + ", страна: " + country +
                ", коробка передач: " + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + regNumber + ", количество мест: " + countSeat +
                ", резина: " + carTyre + ".\n"+
                "Доп.опции: "+ key + "\n"+
                "Данные о страховке: "+ insurance;
    }
}
