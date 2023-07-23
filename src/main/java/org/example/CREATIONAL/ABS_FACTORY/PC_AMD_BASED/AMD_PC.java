package org.example.CREATIONAL.ABS_FACTORY.PC_AMD_BASED;


import org.example.CREATIONAL.ABS_FACTORY.*;

public class AMD_PC {
    public static void main(String[] args) {
        PCFactory pcFactory = new AMD_PC_Factory();

        CPU amdCPU = pcFactory.getCPU();
        GPU amdGPU = pcFactory.getGPU();
        RAM amdRAM = pcFactory.getRAM();
        MBoard amdMBoard = pcFactory.getMBoard();

        System.out.println("Trying to connect all the devices");
        amdMBoard.connectAll();
        amdCPU.calculate();
        amdGPU.draw();
        amdRAM.write();


    }
}
