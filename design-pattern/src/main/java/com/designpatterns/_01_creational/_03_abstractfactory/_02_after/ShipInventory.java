package com.designpatterns._01_creational._03_abstractfactory._02_after;

import com.designpatterns._01_creational._02_factorymethod._02_after.Ship;
import com.designpatterns._01_creational._02_factorymethod._02_after.ShipFactory;
import com.designpatterns._01_creational._03_abstractfactory._01_before.WhiteShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
