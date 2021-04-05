package adapter.instance;
/**
 * extend (클래스를 사용하여 adapter) 는 Print 를 인터페이스로 사용했지만, 여기서는 위임사용 (Print.class)
 */
public abstract class Print {
    public abstract void printLight();
    public abstract void printStrong();
}
