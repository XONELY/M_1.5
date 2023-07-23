package org.example.CREATIONAL.ABS_FACTORY.COMPONENTS;

import org.example.CREATIONAL.ABS_FACTORY.RAM;

public class FURY_RAM implements RAM {
  private int capacity = 16;
    @Override
    public void write() {
        System.out.println("Fury RAM runs with capacity " + capacity+"gb");
    }
}
