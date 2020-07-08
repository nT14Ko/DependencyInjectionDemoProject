package com.nikorych.dependencyinjectiondemoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent carComponent = DaggerCarComponent.create();
        CarComponent carComponent = DaggerCarComponent.builder().carChassisModule(new CarChassisModule(15)).build();
//        car = carComponent.getCar();
        carComponent.inject(this);

        //        CarBattery carBattery = new CarBattery();
 //        CarChassis carChassis = new CarChassis();
//        EngineFlap engineFlap = new EngineFlap();
//        CarEngine carEngine = new CarEngine(engineFlap);
        car.move();
    }
}