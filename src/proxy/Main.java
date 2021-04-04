package proxy;

/**
 * PrinterProxy를 경유해서 Printer를 이용
 * print메소드를 호출해야, printer(본인)이 실제로 업무를 수행
 * 그 외의 업무는 PrinterProxy가 대신 해주고 있음
 *
 * Proxy vs Decorator
 * 프록시 패턴의 경우, 실제 객체에 대한 접근을 제어하는데 초점이 맞춰져 있지만,
 * 데코레이터 패턴은 기존 객체의 기능을 확장(extend)하는데 초점을 맞추고 있다.
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재 " + p.getPrinterName() + " 입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + " 입니다.");
        p.print("Hello, world!");
    }
}
