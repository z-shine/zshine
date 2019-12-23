package principle.builder;

public class Client
{
    public static void main (String[] args) throws Exception
    {
        Director director = new Director(new ProductBuilder());
        Product product = director.construct();
        product.disPlay();
    }
}
