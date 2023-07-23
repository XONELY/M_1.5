package org.example.CREATIONAL.ABS_FACTORY.PC_INTEL_BASED;



import org.example.CREATIONAL.ABS_FACTORY.COMPONENTS.*;
import org.example.CREATIONAL.ABS_FACTORY.*;


public class INTEL_PC_Factory implements PCFactory {
    @Override
    public CPU getCPU() {
        return new INTEL_CPU();
    }

    @Override
    public GPU getGPU() {
        return new RTX_GPU();
    }

    @Override
    public RAM getRAM() {
        return new FURY_RAM();
    }

    @Override
    public MBoard getMBoard() {
        return new GIGABYTE_MBoard();
    }
}
