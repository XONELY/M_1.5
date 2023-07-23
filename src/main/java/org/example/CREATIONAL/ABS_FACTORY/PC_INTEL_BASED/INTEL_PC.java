package org.example.CREATIONAL.ABS_FACTORY.PC_INTEL_BASED;

import org.example.CREATIONAL.ABS_FACTORY.*;


public class INTEL_PC {
    public static void main(String[] args) {
        PCFactory pcFactory = new INTEL_PC_Factory();

        CPU intelCPU = pcFactory.getCPU();
        GPU intelGPU = pcFactory.getGPU();
        RAM intelRAM = pcFactory.getRAM();
        MBoard intelMBoard = pcFactory.getMBoard();

        System.out.println("Trying to connect all the devices");
        intelMBoard.connectAll();
        intelCPU.calculate();
        intelGPU.draw();
        intelRAM.write();


    }
}
