package com.pattern.design_patterns.creational_patterns.factory_method.after;

public class BlackShip extends Ship{
    public BlackShip(String name){
        setName(name);
        setLogo("⚓");
        setColor("black");
    }
}
