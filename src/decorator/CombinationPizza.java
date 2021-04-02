package decorator;

public class CombinationPizza extends Pizza{
    public CombinationPizza() {
        name = "콤비네이션 피자";
    }

    @Override
    public double cost() {
        return 16000;
    }
}
