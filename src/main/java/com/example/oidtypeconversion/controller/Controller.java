package com.example.oidtypeconversion.controller;

import com.example.oidtypeconversion.aggregate.SimpleCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final CommandGateway commandGateway;


    public Controller(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping("/{id}")
    public void create(@PathVariable String id) {
        SimpleCommand command = new SimpleCommand(id);
        commandGateway.sendAndWait(command);
    }
}
