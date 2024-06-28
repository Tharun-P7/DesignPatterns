State Design Pattern :

It allows an object to change its behaviour when its internal state changes. This pattern is particularly useful when an object's behaviour depends on its state & the state can change during the object's lifecycle 


![alt text](https://www.google.com/url?sa=i&url=https%3A%2F%2Fakhileshmj.medium.com%2Fgo-design-pattern-state-design-pattern-low-level-design-of-vending-machine-bad8b092cd94&psig=AOvVaw0LrRZvPP6VO86xOV7iK4gn&ust=1719579396651000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOjprMvq-4YDFQAAAAAdAAAAABAE)

State  | Operation
------------- | -------------
Idle State  | Press Insert Cash Button
HasMoney State  | Insert Coin, Select Product Button,Cancel/Refund
Selection State  | Choose Product, Cancel/Refund
Dispensing State  | Dispense Product