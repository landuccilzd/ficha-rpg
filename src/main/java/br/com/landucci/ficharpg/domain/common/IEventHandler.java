package br.com.landucci.ficharpg.domain.common;

public interface IEventHandler<T> {

    void handle(T t);

}
