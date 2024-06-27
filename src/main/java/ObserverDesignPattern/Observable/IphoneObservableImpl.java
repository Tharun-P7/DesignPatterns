package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserverAlert;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    private List<NotificationObserverAlert> observerList = new ArrayList<>();
    private int stockcount=0;
    @Override
    public void add(NotificationObserverAlert notificationObserverAlert) {
        observerList.add(notificationObserverAlert);
    }

    @Override
    public void delete(NotificationObserverAlert notificationObserverAlert) {
        observerList.remove(notificationObserverAlert);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserverAlert notificationObserverAlert :observerList){
            notificationObserverAlert.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockcount==0) {
            System.out.println("Stock is being added !!!");
            notifySubscribers();
        }
        stockcount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockcount;
    }
}
