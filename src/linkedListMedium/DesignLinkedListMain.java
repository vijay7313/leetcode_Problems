package linkedListMedium;

public class DesignLinkedListMain {
	public static void main(String[] args) {
		DesignLinkedList list = new DesignLinkedList();

		list.addAtHead(1);
		list.addAtTail(3);
		list.addAtIndex(1, 2);
		System.out.println(list.get(1));
		list.deleteAtIndex(1);
		System.out.println(list.get(1));
	}
}
