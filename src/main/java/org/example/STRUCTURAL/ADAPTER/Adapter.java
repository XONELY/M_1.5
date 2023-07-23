package org.example.STRUCTURAL.ADAPTER;

public class Adapter implements VGA{
    private Monitor hdmi;

    public Adapter(Monitor hdmi) {
        this.hdmi = hdmi;
    }
    @Override
    public void connectVGA() {
        System.out.println("Trying to connect VGA to HDMI");
        hdmi.connectHDMI();
    }
}
