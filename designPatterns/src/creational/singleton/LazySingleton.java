package creational.singleton;

/**
 * 懒汉式单例类
 * 类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
