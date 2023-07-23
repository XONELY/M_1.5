package org.example.STRUCTURAL.FLYWEIGHT;

public class Runner {
    public static void main(String[] args) {
        BrushFactory factory = new BrushFactory();
        Brush brush1 = factory.getBrush("Round","Blue");
        Brush brush2 = factory.getBrush("Flat","Red");
        Brush brush3 = factory.getBrush("Erase","None");
        Brush brush4 = factory.getBrush("Flat","Red");

        brush1.draw();
        brush2.draw();
        brush3.draw();
        brush4.draw();




    }
}
