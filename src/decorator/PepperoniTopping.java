package decorator;

public class PepperoniTopping extends Topping {
    Pizza pizza;

    public PepperoniTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getName() {
        return pizza.getName() + ", 페퍼로니 토핑 추가";
    }

    @Override
    public double cost() {
        return 3500 + pizza.cost();
    }
}
