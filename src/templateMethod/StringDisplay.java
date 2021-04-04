package templateMethod;

public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width; // byte 단위로 계산한 문자열의 길이

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length; // 생성자로 전달된 string byte 길이를 기억
    }

    @Override
    public void open() {
        printLine(); // +----------+ 찍음 ('-' 은 length 따름)
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
