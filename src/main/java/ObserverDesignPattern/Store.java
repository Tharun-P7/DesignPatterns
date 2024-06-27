package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserver;
import ObserverDesignPattern.Observer.NotificationObserverAlert;
import ObserverDesignPattern.Observable.IphoneObservableImpl;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();
        iphoneObservable.add(new MobileAlertObserver("tharun@gmail.com",iphoneObservable));
        iphoneObservable.add(new EmailAlertObserverImpl("tharun1@gmail.com",iphoneObservable));
        iphoneObservable.add(new EmailAlertObserverImpl("tharun2@gmail.com",iphoneObservable));

        iphoneObservable.setStockCount(20);

    }

}
