package main.java.com.estagio2.Implementacoes;

public class DoubleLinkedListNode<T> {
    private T data;

    private DoubleLinkedListNode<T> next;

    private DoubleLinkedListNode<T> previous;

    public DoubleLinkedListNode(T data, DoubleLinkedListNode previous, DoubleLinkedListNode next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
    
    public DoubleLinkedListNode(){
        this.data = null;
        this.previous = null;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode<T> next) {
        this.next = next;
    }

    public DoubleLinkedListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedListNode<T> previous) {
        this.previous = previous;
    }

    public boolean isNIL() {
		return (this.data == null);
	}
}
