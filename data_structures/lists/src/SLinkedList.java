
public class SLinkedList {

	protected Node head;
	protected int size;
	
	public SLinkedList() {
		head = null;
		size = 0;
	}
	
	public void insertFront (Object item) {
		head = new Node((int) item, head);
		size++;
	}

}
