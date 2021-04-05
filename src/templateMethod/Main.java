package templateMethod;

/**
 * Template Method 패턴 : 상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 구체적인 내용을 정의하는 패턴
 * 상위클래스는 abstract 클래스이고, 메소드만 정의해 둠
 * 하위 클래스들이 기능을 따로 구현해서 사용하도록 함
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world!");
        AbstractDisplay d3 = new StringDisplay("안녕하세요."); // 16 byte로 기억해서 print할때 차이 있음

        d1.display();
        d2.display();
        d3.display();
    }
}
