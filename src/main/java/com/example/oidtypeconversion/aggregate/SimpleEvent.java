package com.example.oidtypeconversion.aggregate;

public class SimpleEvent {

    private final String id;

    public SimpleEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
