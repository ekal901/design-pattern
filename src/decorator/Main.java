package decorator;

/**
 * Decorator란 ?
 * 메소드 호출의 return 값에 변화를 주기위해 중간 장식자를 추가 하는 패턴
 */

public class Main {
    public static void main(String[] args) {
        Pizza combination = new CombinationPizza();
        System.out.println(combination.getName());
        System.out.println(combination.cost());

        Pizza cheese = new CombinationPizza();
        cheese = new CheeseTopping(cheese);
        cheese = new PepperoniTopping(cheese);
        System.out.println(cheese.getName());
        System.out.println(cheese.cost());
    }
}
