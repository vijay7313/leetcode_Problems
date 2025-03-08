package linkedListMedium;

public class DesignLinkedListMain {
	public static void main(String[] args) {

		DesignLinkedList list = new DesignLinkedList();

//		list.addAtHead(4);
//		list.addAtHead(3);
//		list.addAtHead(2);
//		list.addAtHead(1);
//		list.addAtTail(5);
//		list.addAtTail(6);
//		list.addAtIndex(2, 8);
//		list.addAtIndex(1, 9);
//		list.addAtIndex(5, 90);
//		list.addAtIndex(0, 99);
//		list.deleteAtIndex(0);
		
		list.addAtHead(1);
		list.addAtTail(3);
		list.addAtIndex(1, 2);
		System.out.println(list.get(1));  // Expected output: 2
		list.deleteAtIndex(0);
		System.out.println(list.get(0));  // Expected output: 2

		list.iterate();

	}
}
