package com.eman.datastructures;

import com.eman.datastructures.utils.Sort;

// Time complexity in index
// Array operations:
// - index
// - add
// - remove
// - sort
public class IntegerArray {
	
	private int size;
	private int[] integerArray;
	
	public IntegerArray(int size)
	{
		this.size = size;
		integerArray = new int[size];
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public int index(int index) throws Exception
	{
		if(index > this.size)
			throw new Exception("Index is greater than size of array: Index value is " + index);
		return integerArray[index];
	}
	
	public void add(int index, int newInt)
	{
		integerArray[index] = newInt;
	}
	
	public void remove(int index)
	{
		integerArray[index] = 0;
	}
	
	public void sort(Sort sorter)
	{
		sorter.sort();
	}

}
