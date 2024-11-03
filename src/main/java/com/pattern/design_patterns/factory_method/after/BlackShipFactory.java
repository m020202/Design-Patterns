package com.pattern.design_patterns.factory_method.after;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
