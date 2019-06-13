package br.com.fernando;

public class Nested {

    static class Son {
        public void mothod() {
            System.out.println("call method");
        }
    }

    public static void main(String[] args) {
       Nested.Son s = new Nested.Son();
       s.mothod();
    }
}
