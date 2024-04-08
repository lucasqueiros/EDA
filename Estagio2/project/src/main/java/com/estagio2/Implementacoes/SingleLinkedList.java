package main.java.com.estagio2;

public class SingleLinkedList<T> {
    
    private SingleLinkedListNode<T> head;

    public SingleLinkedList(){}

    public SingleLinkedList(SingleLinkedListNode<T> head) {
        this.head = head;
    }

    public void insert(T element) {
        SingleLinkedListNode<T> newNode = new SingleLinkedListNode(element, new SingleLinkedListNode<T>());

        if (isEmpty()) {
            this.head = newNode;
        } else {
            SingleLinkedListNode aux = this.head;

            while (!aux.getNext().isNIL()){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
    }

    public void remove(T element) {
        if (this.search(element) != null) {
            SingleLinkedListNode aux = this.head;

            while(!aux.getNext().getData().equals(element)) {
                aux = aux.getNext();
            }
            aux.setNext(aux.getNext().getNext());
        }
    }

    public T search(T element){
        if (element != null) {
            SingleLinkedListNode<T> aux = this.head;

            while(!aux.getNext().getData().equals(element)) {
                aux = aux.getNext();
            }

            return aux.getData();
        } else {
            return null;
        }
        
    }

    public int size(){
        int cont = 0;
        if (isEmpty()) return 0;
        else {
            SingleLinkedListNode aux = this.head;
            cont++;
            while(!aux.getNext().isNIL()) {
                cont++;
                aux = aux.getNext();
            }
            return cont;
        }
    }

    public boolean isEmpty(){
        return this.head.isNIL();
    }

    public T[] toArray(){
        T[] array = new Object[size() - 1];

        SingleLinkedListNode<T> aux = this.head;
        for(int i = 0; i < this.size() - 1; i++) {
            array[i] = aux.getData();
            aux = aux.getNext();
        }
        return array;
    }
}