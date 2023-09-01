package part5;

class Car {
    String brand;
    String model;
    int year;

    // Конструктор класса
    Car(String carBrand, String carModel, int carYear) {
        brand = carBrand;
        model = carModel;
        year = carYear;
    }
}

public class try1 {
    public static void main(String[] args) {
        // Создание объекта класса Car с использованием конструктора
        Car myCar = new Car("Тойота", "Camry", 2022);
        System.out.println("Марка: " + myCar.brand);
        System.out.println("Модель: " + myCar.model);
        System.out.println("Год выпуска: " + myCar.year);
    }
}

