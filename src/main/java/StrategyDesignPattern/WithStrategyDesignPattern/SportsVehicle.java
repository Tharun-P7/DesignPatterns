package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){super(new SportsDriveStrategy());}

}
