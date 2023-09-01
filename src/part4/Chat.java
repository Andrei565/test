package part4;

public class Chat {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        changeDogName(myDog);
        System.out.println(myDog.getName()); // Выведет "Rex"
    }

    public static void changeDogName(Dog dog) {
        dog = new Dog("Rex"); // Изменяется копия ссылки, не оригинальный объект
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
