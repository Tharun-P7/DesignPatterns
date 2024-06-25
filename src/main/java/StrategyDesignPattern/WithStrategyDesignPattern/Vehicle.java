package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
