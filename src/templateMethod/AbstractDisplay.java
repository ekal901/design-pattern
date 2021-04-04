package templateMethod;
/**
 * 추상 클래스이기 때문에, 실제로 display 가 구현되어 있다고 하더라도
 * 뭘 하는지에 대한 건, 얘를 상속받는 클래스가 정의해야 함
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display() {
        open();
        for (int i = 0; i < 5;i ++) {
            print();
        }
        close();
    };
}
