package core.generics;

public class LinkedList<T> {
	Integer size;
	Node<T> head;
	
	public LinkedList() {
		this.size = 0;
		head = null;
	}
	
	public void add(T data) {
		size++;
		if(head == null) {
			this.head = new Node<>(data, null);
			return;
		}
		Node<T> tail = getTail();
		tail.next = new Node<>(data, null);
	}
	
	private Node<T> getTail() {
		Node<T> temp = this.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}
	
	
	public Integer getSize() {
		return this.size;
	}
	
	public Node<T> getHead() {
		return head;
	}
	
	public void setHead(Node<T> head) {
		this.head = head;
	}


	@Override
	public String toString() {
		Node<T> temp = this.head;
		String response = ""; 
		while(temp != null) {
			response += temp.data+"  ";
			temp = temp.next;
		}
		return response;
	}
}


class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node() {}
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
}
