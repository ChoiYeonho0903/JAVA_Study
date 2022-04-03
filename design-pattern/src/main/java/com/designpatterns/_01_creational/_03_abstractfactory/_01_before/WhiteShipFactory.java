package com.designpatterns._01_creational._03_abstractfactory._01_before;

import com.designpatterns._01_creational._02_factorymethod._02_after.DefaultShipFactory;
import com.designpatterns._01_creational._02_factorymethod._02_after.Ship;
import com.designpatterns._01_creational._02_factorymethod._02_after.WhiteShip;
import com.designpatterns._01_creational._03_abstractfactory._02_after.ShipPartsFactory;

public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }


    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
