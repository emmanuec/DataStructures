package com.eman.datastructures;

// Linked List Operations
// append
// remove
// index
// sort
// interate
// ***************************
// Time Complexity
//
public class LinkedList {
	private int value;
	private LinkedList next;
	
	public LinkedList(int value)
	{
		this.value = value;
		this.next = null;
	}
	
	/**
	 * Time Complexity:
	 * The main operation is the for loop.
	 * Thus, Big O == O(n), where n is the value of the index.
	 * 
	 * Space Complexity:
	 * The space is based on the number of elements that is
	 * iterated though.
	 * 
	 * @param index
	 * @param value
	 */
	public void addAtIndex(int index, int value)
	{
		// Base case only cares about moving
		// the first node in a linked list forward
		// and not changing the pointer of a previous
		// element.
		if(index == 0)
		{
			this.next = new LinkedList(this.value);
			this.value = value;
		}
		
		LinkedList prevCursor = null;
		LinkedList cursor = this;
		
		// Iterate through the remainder of the linked list finding
		// the element that signifies the index
		for(int curIndex = 1; curIndex <= index; curIndex++)
		{
			prevCursor = cursor;
			cursor = cursor.next;
				
			if(curIndex == index)
			{
				LinkedList newNode = new LinkedList(value);
				// Make previous node point to new item
				prevCursor.next = newNode;
				// Make new node's next item the node
				// that was replaced.
				newNode.next = cursor;			
			}
		}
	}

	public void removeAtIndex(int index)
	{
		
	}
	
	public int valueAtIndex(int index)
	{
		LinkedList cursor = this;
		for(int i = 0; i <= index; i++)
		{
			if(i == index)
				return cursor.value;
			cursor = cursor.next;
		}
		return -1;
	}
	
	@Override
	public String toString()
	{
		LinkedList cursor = this;
		StringBuilder builder = new StringBuilder("[ ");
		while(cursor != null)
		{
			builder.append(cursor.value + " ");
			cursor = cursor.next;
		}
		builder.append("]");
		return builder.toString();
	}
}
