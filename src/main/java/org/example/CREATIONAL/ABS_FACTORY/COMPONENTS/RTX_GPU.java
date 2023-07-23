package org.example.CREATIONAL.ABS_FACTORY.COMPONENTS;

import org.example.CREATIONAL.ABS_FACTORY.GPU;

public class RTX_GPU implements GPU {
    @Override
    public void draw() {
        System.out.println("Drawing by RTX GPU");
    }
}
