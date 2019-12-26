package principle.proxy;

public class MoonProxy implements Star
{
    private Moon moon = new Moon();

    @Override
    public void shine()
    {
        beforeShine();
        moon.shine();
        afterShine();
    }

    private void beforeShine()
    {
        System.out.println("before shining ...");
    }

    private void afterShine()
    {
        System.out.println("after shining ...");
    }
}
