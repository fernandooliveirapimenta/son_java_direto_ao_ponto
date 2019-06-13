package br.com.fernando.generics;


public class App {

    public static void main(String[] args) {
        Store<Double> store = new Store<>();
        store.add(55.0);
        Store<String> sString = new Store<>();
        
        System.out.println(store.getData());
        System.out.println(sString.getData());
    }
}
