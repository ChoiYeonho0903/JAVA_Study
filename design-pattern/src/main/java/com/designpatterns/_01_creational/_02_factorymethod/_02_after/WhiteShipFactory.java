package com.designpatterns._01_creational._02_factorymethod._02_after;

public class WhiteShipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
