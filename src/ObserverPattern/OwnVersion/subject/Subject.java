package ObserverPattern.OwnVersion.subject;

import ObserverPattern.OwnVersion.observer.Observer;

/**
 * 发布者接口
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
