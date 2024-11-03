package com.pattern.design_patterns.creational_patterns.abstract_factory.after;

public interface ShipPartsFactory {
    Anchor createAnchor();

    Wheel createWheel();
}

