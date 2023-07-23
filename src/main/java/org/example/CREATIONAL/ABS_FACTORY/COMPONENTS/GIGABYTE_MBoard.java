package org.example.CREATIONAL.ABS_FACTORY.COMPONENTS;

import org.example.CREATIONAL.ABS_FACTORY.MBoard;

public class GIGABYTE_MBoard implements MBoard {
    @Override
    public void connectAll() {
        System.out.println("All components are connected by GIGABYTE MBoard");
    }
}
