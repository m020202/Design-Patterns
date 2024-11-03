package com.pattern.design_patterns.creational_patterns.abstract_factory.after;

import com.pattern.design_patterns.creational_patterns.abstract_factory.before.WhiteShipFactory;
import com.pattern.design_patterns.creational_patterns.factory_method.after.Ship;
import com.pattern.design_patterns.creational_patterns.factory_method.after.ShipFactory;


public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship ship = shipFactory.createShip("white-sheep");
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
