package main.java.com.estagio2;

public class StaticQueue<T> {
    
    private int head;

    private int tail;

    private T[] fila;

    public StaticQueue(int capacidade) {
        this.fila = (T[]) new Object[capacidade];
        this.head = -1;
        this.tail = -1;

    }

    public boolean isEmpty() {
        return this.head == - 1 && this.tail == - 1;
    }

    public boolean isFull() {
        return (this.tail - this.head == fila.length - 1);
    }

    public void enqueue(T element) throws Exception {
        if (!this.isFull()) {
            if (isEmpty()) {
                this.head++;
                this.tail++;
                this.fila[this.head] = element;
            } else {
                this.tail++;
                this.fila[this.tail] = element;
            }
        } else {
            throw new Exception();
        }
    }

    public T dequeue() throws Exception {
        if (!isEmpty()) {
            T aux = this.fila[this.head];

            if (this.tail - this.head == 1) {
                this.tail --;
                this.head --;
            } else {
                this.head++;
                shiftLeft(head);
                this.tail--;
            }
            return aux;
        } else {
            throw new Exception();
        }
    }

    public T head() {
        return this.fila[head];
    }

    public void shiftLeft (int index) {
        for (int i = index + 1; i < this.fila.length - 1; i++) {
            this.fila[i - 1] = this.fila[i]; 
        }
    }

    //Implementação da fila circular para evitar o shift
    public void circularEnqueue(T element) throws Exception {
       if (this.isFull()) throw new Exception();
       else if (this.isEmpty()) {
        this.head = 0;
        this.tail = 0;
        this.fila[this.tail] = element;
       } else {
        this.tail = (this.tail + 1) % this.fila.length;
        this.fila[this.tail] = element;
       }
    }

    public T circularDequeue() throws Exception {
        if (this.isEmpty()) throw new Exception();
        else if (this.head == this.tail) {
            T aux = this.fila[head];
            this.head--;
            this.tail--;
            return aux;
        } else {
            T aux = this.fila[this.head];
            this.head = (this.head + 1) % this.fila.length;
            return aux;
        }
    }

    public boolean circularIsFull() {
        return (this.tail + 1) % this.fila.length == this.head;
    }
}
