package br.com.landucci.ficharpg.domain.common;

import java.util.ArrayList;
import java.util.List;

public class EvolucaoEventDispatcher implements IEventDispatcher {

    private List<IEventHandler<IEvent>> eventHandlers = new ArrayList<IEventHandler<IEvent>>();

    @Override
    public void notify(IEvent event) {
        this.eventHandlers.forEach((eventHandler) -> 
            eventHandler.handle(event)
        );
    }

    @Override
    public void register(IEventHandler<IEvent> eventHandler) {
        this.eventHandlers.add(eventHandler);
    }

    @Override
    public void unregister(IEventHandler<IEvent> eventHandler) {
        this.eventHandlers.remove(eventHandler);
    }

    @Override
    public void unregisterAll() {
        this.eventHandlers = new ArrayList<IEventHandler<IEvent>>();
    }

    public List<IEventHandler<IEvent>> getEventHandlers() {
        return eventHandlers;
    }
    
}
