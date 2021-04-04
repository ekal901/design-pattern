package proxy;

/**
 * Printer의 존재를 알고있다. Printer 클래스를 선언했기 때문
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer real; // 본인

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string); // Printer(본인)에게 업무를 위임
    }

    private synchronized void realize() {
        if(real == null) {
            real = new Printer(name);
        }
    }
}
