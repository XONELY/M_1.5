package org.example.CREATIONAL.ABS_FACTORY.COMPONENTS;

import org.example.CREATIONAL.ABS_FACTORY.GPU;

public class Radeon_GPU implements GPU {
    @Override
    public void draw() {
        System.out.println("Drawing by Radeon GPU");
    }
}
