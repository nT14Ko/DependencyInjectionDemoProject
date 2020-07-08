package com.nikorych.dependencyinjectiondemoproject;

import android.util.Log;

import javax.inject.Inject;

import static com.nikorych.dependencyinjectiondemoproject.Car.TAG;

public class LithiumIonBattery implements CarBattery {
    @Inject
    public LithiumIonBattery() {
    }

    @Override
    public void logBatteryType() {
        Log.d(TAG, "This is LithiumIonBattery");
    }
}
