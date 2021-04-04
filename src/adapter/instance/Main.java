package adapter.instance;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printLight();
        p.printStrong();
    }
}
