package com.designpatterns._01_creational._03_abstractfactory._03_java;

import com.designpatterns._01_creational._02_factorymethod._02_after.Ship;
import com.designpatterns._01_creational._02_factorymethod._02_after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteShip");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
