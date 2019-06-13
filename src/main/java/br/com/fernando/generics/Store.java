package br.com.fernando.generics;

public class Store<T> {

    private T data;

    public void add(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
