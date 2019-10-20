package queue;

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	DLinkedNode head;
	DLinkedNode tail;
	Item item;
	int size;
	
    // construct an empty deque
    public Deque() {
       head = null;
       tail = null;
       item = null;
       size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
    	return size() == 0;
    }

    // return the number of items on the deque
    public int size() {
    	return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
    	
    }

    // add the item to the back
    public void addLast(Item item)

    // remove and return the item from the front
    public Item removeFirst()

    // remove and return the item from the back
    public Item removeLast()

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
    	
    }
    
    class DLinkedNode {
    	  Item item;
    	  DLinkedNode pre;
    	  DLinkedNode post;
    }
    
    // unit testing (required)
    public static void main(String[] args) {
    	
    }

}
