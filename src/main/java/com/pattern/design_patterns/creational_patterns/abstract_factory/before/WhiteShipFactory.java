package com.pattern.design_patterns.creational_patterns.abstract_factory.before;

import com.pattern.design_patterns.creational_patterns.abstract_factory.after.ShipPartsFactory;
import com.pattern.design_patterns.creational_patterns.abstract_factory.after.WhiteShipPartsFactory;
import com.pattern.design_patterns.creational_patterns.factory_method.after.Ship;
import com.pattern.design_patterns.creational_patterns.factory_method.after.ShipFactory;
import com.pattern.design_patterns.creational_patterns.factory_method.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }
    @Override
    public Ship createShip(String name) {
        Ship ship = new WhiteShip(name);
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}
