package com.pattern.design_patterns.factory_method.after;

import com.pattern.design_patterns.factory_method.before.ShipFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "m020202@naver.com");
        System.out.println(whiteShip);

        System.out.println();

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "m020202@naver.com");
        System.out.println(blackShip);
    }
}
