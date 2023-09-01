package part4;

public class Murzilka {
    public static void main(String[] args) {
        Magazine murzilka = new Magazine(6);
        readPage(murzilka.readingPage);
        System.out.println(murzilka.readingPage );
    }
    private static void readPage(Integer page) {
        page++;
        System.out.println(page + "Page" );

    }
}

class Magazine {
    Integer readingPage;

    public Magazine(Integer readingPage) {
        this.readingPage = readingPage;
    }
}
