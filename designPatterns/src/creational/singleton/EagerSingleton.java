package creational.singleton;

/**
 * 饿汉式单例类
 * 类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance() {
        return instance;
    }

}
