package com.example.oidtypeconversion.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class SimpleAggregate {

    @AggregateIdentifier
    private String id;

    public SimpleAggregate() {
    }

    @CommandHandler
    public SimpleAggregate(SimpleCommand command) {
        SimpleEvent event = new SimpleEvent(command.getId());
        AggregateLifecycle.apply(event);
    }

    @EventSourcingHandler
    public void on(SimpleEvent event) {
        this.id = event.getId();
    }
}
