package decorator;

public class CheezePizza extends Pizza {
    public CheezePizza() {
        name = "치즈피자";
    }

    @Override
    public double cost() {
        return 12000;
    }
}
