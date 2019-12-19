package principle.singleton;

/**
 * 单例模式：饿汉模式
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance()
    {
        return  instance;
    }
}
