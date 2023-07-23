package org.example.STRUCTURAL.COMPOSITE;

import java.util.*;
public class Menu extends Component {
    private List<Component> components = new ArrayList<Component>();
    public Menu(String name) {
        super(name);
    }
    public void add(Component component) {
        components.add(component);
    }
    public void show() {
        System.out.println(name);
        for (Component component : components) {
            component.show();
        }
    }

    public void remove(Component component) {
        components.remove(component);
    }
}
