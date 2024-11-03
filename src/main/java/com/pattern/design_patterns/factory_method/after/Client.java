package com.pattern.design_patterns.factory_method.after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "white-ship", "m020202@naver.com");
        System.out.println();
        client.print(new BlackShipFactory(), "black-ship", "m020202@naver.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
