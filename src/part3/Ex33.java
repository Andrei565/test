package part3;

public class Ex33 {
    public static void main(String[] args) {
        Hamster homa = new Hamster();
        System.out.println("Имя хомяка: " + homa.name);
        System.out.println("Возраст хомяка: " + homa.age);
        System.out.println("Вес хомяка: " + homa.weight);
        System.out.println("Пушистый ли хомяк: " + homa.isFluffy);
        System.out.println("Цвет хомяка: " + homa.color);
        System.out.println("абобус " + homa);
    }
}
class Hamster {
    String name;
    int age;
    double weight;
    boolean isFluffy;
    String color = "Рыжий";
}