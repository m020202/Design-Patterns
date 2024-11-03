package com.pattern.design_patterns.creational_patterns.factory_method.after;

public class WhiteShip extends Ship {
    public WhiteShip(String name) {
        setName(name);
        setLogo("\uD83D\uDEE5️");
        setColor("white");
    }
}
