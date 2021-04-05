package iterator;

/**
 * 집함체라는 의미의 형태로 만든 인터페이스
 * BookShelf 에서 implements 하여 Iterator 를 사용
 */
public interface Aggregate {
    public abstract Iterator iterator();
}
