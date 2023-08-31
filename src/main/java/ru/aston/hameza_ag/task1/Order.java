package ru.aston.hameza_ag.task1;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private List<Computer> orderList;

    public Order(List<Computer> orderList) {
        this.orderList = orderList;
    }

    public BigDecimal sumAllOrders() {
        BigDecimal sumAllOrders = new BigDecimal("0");

        for(Computer computer:orderList) {
            sumAllOrders = sumAllOrders.add(computer.getPrice());
        }
        return sumAllOrders;
    }

    public List<Computer> getSortedList(){
        orderList.sort((o1, o2) -> o1.getUser().getSourName().compareTo(o2.getUser().getSourName()));
        return orderList;
    }
}
