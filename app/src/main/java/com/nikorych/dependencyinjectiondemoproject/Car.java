package com.nikorych.dependencyinjectiondemoproject;

import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class Car {

    private CarEngine carEngine;
    private CarBattery carBattery;
    private CarChassis carChassis;
    public static final String TAG = "CarTag";

    @Inject
    public Car(CarEngine carEngine, CarBattery carBattery, CarChassis carChassis) {
        this.carEngine = carEngine;
        this.carBattery = carBattery;
        this.carChassis = carChassis;
    }
    
    public void move(){
        Log.d(TAG, "Car is moving");
    }
}
