package main.java.com.estagio2;

public class SingleLinkedListNode<T> {
    
    private T data;

    private SingleLinkedListNode next;

    public SingleLinkedListNode(T data, SingleLinkedListNode next){
        this.data = data;
        this.next = next;
    }

    public SingleLinkedListNode() {
        this.data = null;
        this.next = null;
    }

    public T getData() {
        return this.data;
    }

    public SingleLinkedListNode getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(SingleLinkedListNode<T> next) {
        this.next = next;
    }

    public boolean equals(SingleLinkedListNode node) {
        if (this.data == node.getData()) return true;
        return false;
    }

    public boolean isNIL() {
		return (this.data == null);
	}
    
}
