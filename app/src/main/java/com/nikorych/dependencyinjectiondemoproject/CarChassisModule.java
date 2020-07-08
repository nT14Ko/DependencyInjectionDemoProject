package com.nikorych.dependencyinjectiondemoproject;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

import static com.nikorych.dependencyinjectiondemoproject.Car.TAG;

@Module
public class CarChassisModule {
    private int weight;

    public CarChassisModule(int weight) {
        this.weight = weight;
    }

    @Provides
     CarChassis provideCarChassis(){
        Log.d(TAG,"Car chassis weight is " + weight);
        return new CarChassis();
    }
}
