package org.example.CREATIONAL.ABS_FACTORY.COMPONENTS;

import org.example.CREATIONAL.ABS_FACTORY.CPU;

public class INTEL_CPU implements CPU {
    private Integer cores = 8;
    private Integer threads = 4;

    @Override
    public  void calculate() {
        System.out.println("Intel CPU core is running with " + cores + " cores and " + threads + " threads");
    }
}
