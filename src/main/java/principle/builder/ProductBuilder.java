package principle.builder;

public class ProductBuilder extends Builder {

    @Override
    public void buildPartA()
    {
        product.setPartA("A");
    }

    @Override
    public void buildPartB()
    {
        product.setPartB("B");
    }

    @Override
    public void buildPartC()
    {
        product.setPartC("C");
    }
}
