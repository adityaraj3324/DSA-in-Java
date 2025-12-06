package linkedList;

public class LL {
	Node head;
	int size;
	
	LL(){
		this.size = 0;
	}
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	// Add at First
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	// Add at Last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	// delete first
		public void deleteFirst() {
			if(head == null) {
				System.out.println("List is empty.");
				return;
			}
			size--;
			head = head.next;
		}
	
		// delete last
		public void deleteLast() {
			if(head == null) {
				System.out.println("List is empty.");
				return;
			}
			
			size--;
			if(head.next == null) {
				head = null;
				return;
			}
			
			Node secondLast = head;
			Node last = head.next;
			while(last.next != null) {
				last = last.next;
				secondLast = secondLast.next;
			}
			
			secondLast.next = null;
		}
		public void getSize() {
			System.out.println(size);
		}
	// print
	public void printList() {
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+" -->  ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	
	public static void main(String[] args) {

		LL list = new LL();
		list.addFirst("list ");
		list.addFirst("is ");
		list.addFirst("This ");
		list.printList();

		list.addLast("of");
		list.addLast("Adi");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		list.getSize();
	}
}