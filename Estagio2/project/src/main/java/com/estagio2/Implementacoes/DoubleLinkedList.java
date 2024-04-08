package main.java.com.estagio2.Implementacoes;

public class DoubleLinkedList <T> {
    
    private T data;

    private DoubleLinkedListNode<T> head;

    private DoubleLinkedListNode<T> tail;

    public DoubleLinkedList() {}

    //os outros metodos sao iguais ao da singlelinkedlist
    
    public void insertFirst(T element) {
        DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>(element);
        newNode.setPrevious(new DoubleLinkedListNode<>());
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void removeFirst() {
        this.head = this.head.getNext();
        this.head.getPrevious(new DoubleLinkedListNode<>());
    }

    public void removeLast(){
        this.tail = this.tail.getPrevious();
        this.tail.getNext(new DoubleLinkedListNode<>());
    }
}
