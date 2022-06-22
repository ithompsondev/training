package com.sandbox.beansandbox.setterinject;

public class Bean {
    private String name;
    private int length;
    private Soil soil;

    public void setName(String name) {
        System.out.println("Applied name: " + name + " to new bean.");
        this.name = name;
    }

    public void setLength(int length) {
        System.out.println("Applied length: " + length + " mm to new bean.");
        this.length = length;
    }

    public void setSoil(Soil soil) {
        System.out.println("Applied soil to new bean");
        this.soil = soil;
    }
}
