package com.designpatterns._01_creational._01_singleton;

import java.io.Serializable;

public class Settings implements Serializable {
    private Settings() {};

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
