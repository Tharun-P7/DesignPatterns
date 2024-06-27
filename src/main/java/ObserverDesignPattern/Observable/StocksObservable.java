package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserverAlert;

import java.util.List;

public interface StocksObservable {
    public void add(NotificationObserverAlert notificationObserverAlert);
    public void delete(NotificationObserverAlert notificationObserverAlert);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();

}
