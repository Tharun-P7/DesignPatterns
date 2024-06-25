package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
