package org.example.CREATIONAL.ABS_FACTORY.PC_AMD_BASED;


import org.example.CREATIONAL.ABS_FACTORY.*;
import org.example.CREATIONAL.ABS_FACTORY.COMPONENTS.*;

public class AMD_PC_Factory implements PCFactory {
    @Override
    public CPU getCPU() {
        return new AMD_CPU();
    }

    @Override
    public GPU getGPU() {
        return new Radeon_GPU();
    }

    @Override
    public RAM getRAM() {
        return new HyperX_RAM();
    }

    @Override
    public MBoard getMBoard() {
        return new ASROCK_MBoard();
    }
}
