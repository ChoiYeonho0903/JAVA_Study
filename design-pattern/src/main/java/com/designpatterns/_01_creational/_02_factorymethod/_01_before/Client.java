package com.designpatterns._01_creational._02_factorymethod._01_before;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "***@mail.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("BlackShip", "***@mail.com");
        System.out.println(blackShip);
    }
}
