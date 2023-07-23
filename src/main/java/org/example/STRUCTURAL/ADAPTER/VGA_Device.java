package org.example.STRUCTURAL.ADAPTER;

public class VGA_Device implements VGA{
    @Override
    public void connectVGA() {
        System.out.println("Connected to VGA");
    }
}
