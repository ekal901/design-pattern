package decorator;

/**
 * 토핑 추상 클래스
 * Pizza를 상속 받는 이유? 피자의 이름과 가격에 영향을 주기 위한것인듯
 * 그럼 바로 다른 토핑들이 피자를 상속 받을수 있지 않는가? 피자라는 클래스는 피자 아래에 다른 피자들이 존재하고 피자 아래에는 토핑이 존재,
 * 개념상, 토핑 밑에 여러 종류의 토핑이 있는게 말이 맞는것 같다. 그래서 구분한것 같다고 혼자 생각했다.
 */
public abstract class Topping extends Pizza {
}
