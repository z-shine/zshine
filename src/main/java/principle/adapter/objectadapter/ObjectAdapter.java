package principle.adapter.objectadapter;

import principle.adapter.clazzadapter.Adptee;
import principle.adapter.clazzadapter.Target;

public class ObjectAdapter implements Target
{
    private Adptee adptee;

    public ObjectAdapter(Adptee adptee)
    {
        this.adptee = adptee;
    }

    @Override
    public void show()
    {
        adptee.specificShow();
    }

    public static void main(String[] args)
    {
        Target target = new ObjectAdapter(new Adptee());
        target.show();
    }

}
