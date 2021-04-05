package factoryMethod.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner); // 제품 만듬
    protected abstract void registerProduct(Product product); // 제품 등록
}
