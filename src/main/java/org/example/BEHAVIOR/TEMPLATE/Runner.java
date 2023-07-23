package org.example.BEHAVIOR.TEMPLATE;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Preparing tea:");
        HotBeverage tea = new Tea();
        tea.prepareBeverage();

        System.out.println("\nPreparing coffee:");
        HotBeverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
