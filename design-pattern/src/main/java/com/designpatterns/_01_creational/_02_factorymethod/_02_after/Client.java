package com.designpatterns._01_creational._02_factorymethod._02_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "***@email.com");
        client.print(new BlackShipFactory(), "blackShip", "***@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
