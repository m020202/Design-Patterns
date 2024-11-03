package com.pattern.design_patterns.factory_method.after;


public class WhiteShipFactory implements ShipFactory{
    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
