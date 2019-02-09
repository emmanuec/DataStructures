import static org.junit.Assert.*;

import org.junit.Test;

import com.eman.datastructures.LinkedList;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.*;

public class LinkedListTest {

	@Test
	public void test_addAtIndex_onElementExist() {
		LinkedList linkedList = new LinkedList(1);
		
		linkedList.addAtIndex(0, 2);
		
		assertThat(linkedList.valueAtIndex(0), CoreMatchers.is(CoreMatchers.equalTo(2)));
		assertThat(linkedList.valueAtIndex(1), CoreMatchers.is(CoreMatchers.equalTo(1)));
	}
	
	@Test
	public void test_addAtIndex_middleOfLinkedList() {
		LinkedList linkedList = new LinkedList(1);
		linkedList.addAtIndex(1, 2);
		linkedList.addAtIndex(2, 4);
		linkedList.addAtIndex(2, 3);
		
		assertThat(linkedList.valueAtIndex(0), CoreMatchers.is(CoreMatchers.equalTo(1)));
		assertThat(linkedList.valueAtIndex(1), CoreMatchers.is(CoreMatchers.equalTo(2)));
		assertThat(linkedList.valueAtIndex(2), CoreMatchers.is(CoreMatchers.equalTo(3)));
		assertThat(linkedList.valueAtIndex(3), CoreMatchers.is(CoreMatchers.equalTo(4)));
	}

}
