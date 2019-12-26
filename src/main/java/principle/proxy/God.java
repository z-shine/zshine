package principle.proxy;

public class God {

    public static void main(String[] args) throws Exception
    {
        MoonProxy moonProxy = new MoonProxy();
        moonProxy.shine();
    }
}