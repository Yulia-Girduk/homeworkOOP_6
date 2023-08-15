package org.example;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(new String("dss"),new String("ss"), 88, 12.25);
        InitOrder initOrder = new InitOrder();
        SaveOrderToJson saveOrder = new SaveOrderToJson();
        initOrder.inputFromConsole();
        saveOrder.saveToJson(order);
        Order order1 = new Order(initOrder);
        saveOrder.saveToJson(order1);
        System.out.println(order1.toString());
        System.out.println(order.toString());


    }
}
