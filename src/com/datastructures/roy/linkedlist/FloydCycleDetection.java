package com.datastructures.roy.linkedlist;

public class FloydCycleDetection {
	
	public static void main(String[] arg) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtFirst(1);
		list.insertAtFirst(2);
		list.insertAtFirst(3);
	
        System.out.println("Before adding loop: " + detectLoop(list));
        list.head.next.next = list.head;
        System.out.println("After adding loop: " + detectLoop(list));
	}
	
	public static boolean detectLoop(SinglyLinkedList list) {
		SinglyLinkedList.Node fast = list.head.next;
		SinglyLinkedList.Node slow = list.head;
		
		while(fast !=null && slow!=null && fast.next!=null) {
			if(slow == fast) {
				return true;
			}
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return false;
		
	}

}
