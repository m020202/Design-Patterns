package com.pattern.design_patterns.creational_patterns.abstract_factory.after;

public class WhiteShipPartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
