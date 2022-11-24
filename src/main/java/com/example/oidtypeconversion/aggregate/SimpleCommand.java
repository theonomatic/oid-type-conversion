package com.example.oidtypeconversion.aggregate;

public class SimpleCommand {

    private final String id;


    public SimpleCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
