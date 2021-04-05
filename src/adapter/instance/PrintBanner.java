package adapter.instance;

/**
 * Adapter
 * extend 의 케이스는 단일 상속이 가능했고, implements 를 사용하여 어댑터 기능 구현
 * 이 경우에는 두 클래스를 상속할 수 없기 때문에,
 * 생성자에서 Banner 클래스를 매개로 두 메소드를 실행하도록 함
 * Banner 클래스를 경유하여 메소드 호출, 즉, 위임
 * extend 는 PrintBanner 가 직접 일을 했지만, 여기서는 Banner 의 메소드가 실행되면 대신 일을 했다.
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printLight() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
