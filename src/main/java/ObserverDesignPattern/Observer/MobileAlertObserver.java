package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationObserverAlert {
    StocksObservable stocksObservable = new IphoneObservableImpl();
    String username;

    public MobileAlertObserver(String username,StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.username = username;
    }

    @Override
    public void update() {
        sendMail(username,"Stock is being added");
    }
    public void sendMail(String username,String msg){
        System.out.println("SMS sent to "+username);
    }
}
