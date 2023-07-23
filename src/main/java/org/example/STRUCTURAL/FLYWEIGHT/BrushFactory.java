package org.example.STRUCTURAL.FLYWEIGHT;

import java.util.*;

public class BrushFactory {
    private Map<String,Color> colors = new HashMap<String,Color>();


    Brush getBrush (String name, String color) {
        String key = name + color;
        if (colors.containsKey(key)) {
            return new Brush(name, colors.get(key));
        }else {
            Color newColor = new Color(color);
            colors.put(key, newColor);
            return new Brush(name, newColor);
        }
    }

}
