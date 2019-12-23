package principle.factorymethod.impl;

import principle.factorymethod.AbstractFactory;
import principle.factorymethod.Product;

public class IphoneFactory implements AbstractFactory
{
    public Product newProduct()
    {
        return new Iphone();
    }
}
