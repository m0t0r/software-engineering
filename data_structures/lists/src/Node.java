
public class Node {
	
	private int item;
	private Node next;
	
	public Node(int item, Node next) {
		this.item = item;
		this.next = next;
	}
	
	public Node(int item) {
		this(item, null);
	}
	
	public int getElement() {
		return item;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setElement(int newElement) {
		item = newElement;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}

}
