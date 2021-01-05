package com.kiyotakeshi.applicationContextExperiment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

// @ComponentScan(basePackages = "com.kiyotakeshi.applicationContextExperiment.beans")
@Component
public class Car {

    @Autowired
    private Battery battery;

    @Autowired
    private Engine engine;

    @Autowired
    private Wheels wheels;

    @Autowired
    private Gearbox gearbox;

    public void drive() {
        battery.supplyPower();
        engine.start();
        gearbox.putIntoDrivePosition();
        wheels.roll();
    }
}
