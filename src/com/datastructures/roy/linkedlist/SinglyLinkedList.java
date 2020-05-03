package com.datastructures.roy.linkedlist;

public class SinglyLinkedList {
	
	public class Node{
		int value;
		Node next;
	}
	public Node head;
	
	public SinglyLinkedList() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		return false;
	}
	
	public void insertAtFirst(int value) {
		Node node = new Node();
		node.value = value;
		node.next = head;
		head = node;
	}

}
