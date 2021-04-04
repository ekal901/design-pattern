package adapter.extend;

/**
 * Adapter
 * Banner 클래스 상속으로 showWithParen 이랑 showWithAster 사용 가능
 * Print 인터페이스 implements 로 Print p = new PrintBanner() 사용 가능하게 됨
 * Main 은 전혀 PrintBanner 내부의 구현을 모른다.
 * Thus, Main 의 변경 없이, PrintBanner 구현의 변경이 가능
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printLight() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
