package chast2;

public class zadacha1 {
    public static void main(String[] args) {

        Bird tweety = new Bird();
        Bird pepper = new Bird();
        Bird flossie = new Bird();
    }
}
class Bird {

    private static int count = 0;

    Bird() {
        count++;
        System.out.println("Количество созданных объектов: " + count);
    }
}
