package com.designpatterns._01_creational._02_factorymethod.java;

import com.designpatterns._01_creational._02_factorymethod._02_after.BlackShip;
import com.designpatterns._01_creational._02_factorymethod._02_after.WhiteShip;

public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteShip")) {
            return new WhiteShip();
        } else if (name.equals("blackShip")){
            return new BlackShip();
        }
        throw new IllegalArgumentException();
    }
}
