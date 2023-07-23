package org.example.CREATIONAL.ABS_FACTORY.COMPONENTS;

import org.example.CREATIONAL.ABS_FACTORY.RAM;

public class HyperX_RAM implements RAM {
  private int capacity = 8;
    @Override
    public void write() {
        System.out.println("HyperX RAM runs with capacity " + capacity+"gb");
    }
}
