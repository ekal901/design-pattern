package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 추상 클래스인 Factory 클래스를 상속 받아 반드시 구현하였다.
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
