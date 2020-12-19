package SingletonPattern;

/**
 * 单例模式
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 多线程下可能存在问题，有可能多个线程都进入了if语句中
     * 防止该情况发生
     * 1. 对getInstance方法加锁，但是只是在初始化的生活才需要锁，初始化完成后不需要锁了
     * 2. 直接在声明的时候就初始化，保证线程安全
     * 3. double-checked locking
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
