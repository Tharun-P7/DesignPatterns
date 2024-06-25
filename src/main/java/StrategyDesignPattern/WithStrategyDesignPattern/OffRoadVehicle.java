package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){super(new SportsDriveStrategy());}

}
