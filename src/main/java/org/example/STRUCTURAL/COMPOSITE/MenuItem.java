package org.example.STRUCTURAL.COMPOSITE;

public class MenuItem extends Component{


    public MenuItem(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}
