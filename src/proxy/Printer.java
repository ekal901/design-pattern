package proxy;

/**
 * PrinterProxy의 존재를 모름
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printer의 instance를 생성중");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer의 instance [ " + name + " ]을 생성중");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("==== " + name + "===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
            }
            System.out.println(".");
        }
        System.out.println("완료.");
    }
}
