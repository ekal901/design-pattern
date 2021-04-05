package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;

/**
 * FactoryMethod 패턴 : 상위 클래스가 인스턴스를 만드는 방법을 결정하지만 구체적인 클래스이름은 결정하지 않음
 */
public class Main {
    public static void main(String[] args) {
        // Factory 클래스를 상속받은 (create 메소드 상속) IDCardFactory 인스턴스 생성
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("이유진");
        // 1.Factory 클래스를 상속 받아서, Factory 클래스의 create() 를 실행
        // 2.Factory 클래스 안의 create 실행
        // 3. createProduct 실행 (IDCardFactory 클래스의 createProduct 실행)
        // 4. IDCard 생성자에서 System.out.println(이유진 + "의 카드를 만듭니다."); 출력
        // 5. IDCardFactory 의 registerProduct 실행
        // 6. owners.add(((IDCard)product).getOwner()); 담기 add 실행하면서 7번 먼저 수행
        // 7. IDCard의 getOwner 실행 ((IDCard)product).getOwner() 실행
        Product card2 = factory.create("김담희");
        Product card3 = factory.create("김용호");

        card1.use();
        // 1. Product 클래스를 상속 받은 IDCard 클래스의 user 호출
        // 2. System.out.println(이유진 + "의 카드를 사용합니다.");
        card2.use();
        card3.use();
    };

}
