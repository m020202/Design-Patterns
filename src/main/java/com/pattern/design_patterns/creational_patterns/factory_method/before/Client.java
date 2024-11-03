package com.pattern.design_patterns.creational_patterns.factory_method.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("White-Ship", "keesun@mail.com");
        System.out.println(whiteship);

        System.out.println();

        Ship blackship = ShipFactory.orderShip("Black-Ship", "keesun@mail.com");
        System.out.println(blackship);
    }
}
