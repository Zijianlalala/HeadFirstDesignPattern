package ObserverPattern.OwnVersion.observer;

/**
 * 订阅者接口
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
