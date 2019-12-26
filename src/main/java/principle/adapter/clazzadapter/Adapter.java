package principle.adapter.clazzadapter;

public class Adapter extends Adptee implements Target
{
    @Override
    public void show()
    {
        specificShow();
    }
}
