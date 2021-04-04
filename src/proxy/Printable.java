package proxy;

/**
 * PrintProxy 클래스와 Printer 클래스를 동일시 하기 위한 것
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
