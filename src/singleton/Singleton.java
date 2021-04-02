package singleton;

/**
 * 싱글턴 패턴이란 ?
 * - 하나의 인스턴스를 만들어서 사용하는 패턴 (ex. 커넥션 풀, 스레드 풀, 디바이스 설정 객체)
 * - 최초 한번만 메모리를 할당하고 할당된 메모리에서만 사용하는 방식
 * - 고정된 메모리 영역을 사용하여 메모리 낭비를 줄이고 공통객체를 사용할 때 매번 객체를 새로 생성하지 않음
 *
 * 자바에서의 HashCode는 힙 영역의 메모리 주소로 생성이 된다.
 * 싱글턴 패턴으로 생성된 인스턴스는 같은 hashCode를 갖고 있다.
 */
public class Singleton {
    private static Singleton singletonInstance;

    // !! 생성자 자체를 private으로 두어 new를 사용하여 새로운 인스턴스를 만들지 못하도록 함
    private Singleton() {
    }

    // 생성자를 통해 객체를 생성하는 대신, getInstance 메소드를 통해서 객체를 반환
    // getInstance 객체를 통해 한번만 생성된 객체를 가져옴
    public static Singleton getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new Singleton(); // 최초 한번만 new 연산자를 메모리에 할당
        }
        return singletonInstance;
    }
}
