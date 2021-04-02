package decorator;

/**
 * 데코레이터 역할 (피자의 값이나 이름의 반환값에 변화를 주기 위해 추가된 데코레이터) 
 */
public class CheeseTopping extends Topping{
    Pizza pizza;

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getName() {
        return pizza.getName() + ", 치츠 토핑 추가";
    }

    @Override
    public double cost() {
        return 3000 + pizza.cost();
    }
}
