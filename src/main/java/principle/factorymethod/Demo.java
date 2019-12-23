package principle.factorymethod;

import principle.factorymethod.util.XMLReader;

class Demo
{
    public static void main (String[] args) throws Exception
    {
        AbstractFactory factory = (AbstractFactory) XMLReader.getObject();
        Product product = factory.newProduct();
        product.show();
    }
}
