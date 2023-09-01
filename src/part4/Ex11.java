package part4;

class Hamster {
    String name;
    int age;
    int weight;
    String color;

    Hamster(String hamsterName, int hamsterAge, int hamsterWeight) {
        name = hamsterName;
        age = hamsterAge;
        weight = hamsterWeight;
    }
}
public class Ex11 {
    public static void main(String[] args) {
        Hamster homa = new Hamster("Хома", 2, 10);
        System.out.println("Цвет хомяка: " + homa.color);
    }
}
