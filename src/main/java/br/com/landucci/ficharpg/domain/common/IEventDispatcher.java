package br.com.landucci.ficharpg.domain.common;

public interface IEventDispatcher {
    
    void notify(IEvent event);
    void register(IEventHandler<IEvent> eventHandler);
    void unregister(IEventHandler<IEvent> eventHandler);
    void unregisterAll();

}
