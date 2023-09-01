package part5;

public class Murz {
    public static void main(String[] args) {
        Magazine murzilka = new Magazine(6);
        readPage(murzilka.readingPage);
        System.out.println(murzilka.readingPage);
    }
    private static void readPage(Integer page) {
        page++;
    }
}

class Magazine {
    Integer readingPage;

    public Magazine(Integer readingPage) {
        this.readingPage = readingPage;
    }
} // почему здесь не будет напечатано 7?