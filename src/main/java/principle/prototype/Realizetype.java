package principle.prototype;

/**
 * 设计模式：原型模式
 */
class Realizetype implements Cloneable
{
    Realizetype()
    {
        System.out.println("具体原型创建成功");
    }

    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}

class PrototypeTest
{
    public static void main(String[] args) throws Exception
    {
        Realizetype realizetype1 = new Realizetype();
        Realizetype realizetype2 = (Realizetype) realizetype1.clone();
        System.out.println(realizetype1 == realizetype2);
    }
}
