package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationObserverAlert{
    String email;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String email, StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMail(email,"Product is in stock!!! Hurry Up!!");
    }

    public void sendMail(String email,String msg){
        System.out.println("Mail sent to "+email);
    }
}
