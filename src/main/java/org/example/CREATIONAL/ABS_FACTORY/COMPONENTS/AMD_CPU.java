package org.example.CREATIONAL.ABS_FACTORY.COMPONENTS;


import org.example.CREATIONAL.ABS_FACTORY.CPU;

public class AMD_CPU implements CPU {
    private Integer cores = 4;
    private Integer threads = 2;

    @Override
    public  void calculate() {
        System.out.println("AMD CPU core is running with " + cores + " cores and " + threads + " threads");
    }
}
