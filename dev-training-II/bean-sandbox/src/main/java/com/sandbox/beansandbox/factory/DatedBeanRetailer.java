package com.sandbox.beansandbox.factory;

public class DatedBeanRetailer {
    private DatedBean stock;

    public DatedBeanRetailer(DatedBean stock) {
        this.stock = stock;
    }

    public void displayInventory() {
        System.out.println("Our bean stock arrived at " + stock.getTime());
    }
}
