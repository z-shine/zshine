package principle.singleton;

/**
 * 单例模式：懒汉模式
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton(){}

    private static synchronized LazySingleton getInstance()
    {
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
