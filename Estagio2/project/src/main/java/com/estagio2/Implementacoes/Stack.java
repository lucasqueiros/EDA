package main.java.com.estagio2;

import java.util.Arrays;

public class Stack<T> {
    
    private int topo;

    private T[] pilha;

    public Stack(int capacidade) {
        this.topo = -1;
        this.pilha = (T[]) new Object[capacidade];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return this.topo == this.pilha.length - 1;
    }

    public void push(T element) {
        if (isFull()) throw new StackOverflowError();    
        this.pilha[++this.topo] = element;
    }

    public T pop () throws Exception {
        if (this.isEmpty()) throw new Exception();
        T aux = pilha[this.topo];
        this.pilha[this.topo] = null;
        this.topo--;

        return aux;
    }

    public T peek() {
        return this.pilha[this.topo];
    }

    @Override
    public String toString() {
        return "Stack [topo=" + topo + ", pilha=" + Arrays.toString(pilha) + "]";
    }
}
