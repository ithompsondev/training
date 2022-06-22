package com.sandbox.beansandbox.factory;

import java.time.LocalTime;

public class DatedBean {
    private LocalTime current;

    public DatedBean(LocalTime localTime) {
        this.current = localTime;
    }

    public String getTime() {
        return this.current.toString();
    }
}
