package decorator;

/**
 * 피자 추상 클래스
 */
public abstract class Pizza {
    String name = "이름을 알 수 없는 피자";

    public String getName() {
        return name;
    }

    public abstract double cost();
}
