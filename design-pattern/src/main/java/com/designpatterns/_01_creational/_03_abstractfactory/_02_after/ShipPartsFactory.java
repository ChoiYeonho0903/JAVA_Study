package com.designpatterns._01_creational._03_abstractfactory._02_after;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();

}
