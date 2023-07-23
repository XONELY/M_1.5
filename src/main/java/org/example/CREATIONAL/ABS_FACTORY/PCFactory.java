package org.example.CREATIONAL.ABS_FACTORY;

public interface PCFactory {
    CPU getCPU();
    GPU getGPU();
    RAM getRAM();
    MBoard getMBoard();
}
