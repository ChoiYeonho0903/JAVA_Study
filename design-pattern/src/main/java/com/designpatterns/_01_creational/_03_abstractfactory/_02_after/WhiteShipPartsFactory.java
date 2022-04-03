package com.designpatterns._01_creational._03_abstractfactory._02_after;

import com.designpatterns._01_creational._03_abstractfactory._01_before.WhiteAnchor;
import com.designpatterns._01_creational._03_abstractfactory._01_before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
