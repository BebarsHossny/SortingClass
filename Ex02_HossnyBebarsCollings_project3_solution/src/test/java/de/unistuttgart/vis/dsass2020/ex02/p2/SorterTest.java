package de.unistuttgart.vis.dsass2020.ex02.p2;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.Assert;
import de.unistuttgart.vis.dsass2020.ex02.p2.ISimpleList;
import de.unistuttgart.vis.dsass2020.ex02.p2.Sorter;

public class SorterTest {

	@Test()
	public void InsertionSortRandomlyPositionedElements() {
		Sorter sort = new Sorter();
		SimpleList list = new SimpleList();
		list.append(1);
		list.append(20);
		list.append(8);
		list.append(5);
		list.append(3);
		list.append(7);
		list.append(0);
		
		sort.insertionSort(list);
		assertEquals(0,list.get(0));
		assertEquals(1,list.get(1));
		assertEquals(3,list.get(2));
		assertEquals(5,list.get(3));
		assertEquals(7,list.get(4));
		assertEquals(8,list.get(5));
		assertEquals(20,list.get(6));
	}
	
	@Test()
	public void SelectionSortRandomlyPositionedElements() {
		Sorter sort = new Sorter();
		SimpleList list = new SimpleList();
		list.append(1);
		list.append(20);
		list.append(8);
		list.append(5);
		list.append(3);
		list.append(7);
		list.append(0);
		
		sort.selectionSort(list);
		assertEquals(0,list.get(0));
		assertEquals(1,list.get(1));
		assertEquals(3,list.get(2));
		assertEquals(5,list.get(3));
		assertEquals(7,list.get(4));
		assertEquals(8,list.get(5));
		assertEquals(20,list.get(6));
	}
	
	@Test()
	public void BubbleSortRandomlyPositionedElements() {
		Sorter sort = new Sorter();
		SimpleList list = new SimpleList();
		list.append(1);
		list.append(20);
		list.append(8);
		list.append(5);
		list.append(3);
		list.append(7);
		list.append(0);
		
		sort.bubbleSort(list);
		assertEquals(0,list.get(0));
		assertEquals(1,list.get(1));
		assertEquals(3,list.get(2));
		assertEquals(5,list.get(3));
		assertEquals(7,list.get(4));
		assertEquals(8,list.get(5));
		assertEquals(20,list.get(6));
	}
	
	
	
	@Test()
	public void BubbleSortSortedElements() {
		Sorter sort = new Sorter();
		SimpleList list = new SimpleList();
		
		for(int i=0; i<7; i++) {
			list.append(i);
		}
		
		sort.bubbleSort(list);
		assertEquals(0,list.get(0));
		assertEquals(1,list.get(1));
		assertEquals(2,list.get(2));
		assertEquals(3,list.get(3));
		assertEquals(4,list.get(4));
		assertEquals(5,list.get(5));
		assertEquals(6,list.get(6));
	}
	
	@Test()
	public void SelectionSortSortedElements() {
		Sorter sort = new Sorter();
		SimpleList list = new SimpleList();
		
		for(int i=0; i<7; i++) {
			list.append(i);
		}
		
		sort.selectionSort(list);
		assertEquals(0,list.get(0));
		assertEquals(1,list.get(1));
		assertEquals(2,list.get(2));
		assertEquals(3,list.get(3));
		assertEquals(4,list.get(4));
		assertEquals(5,list.get(5));
		assertEquals(6,list.get(6));
	}
	
	@Test()
	public void InsertionSortSortedElements() {
		Sorter sort = new Sorter();
		SimpleList list = new SimpleList();
		
		for(int i=0; i<7; i++) {
			list.append(i);
		}
		
		sort.insertionSort(list);
		assertEquals(0,list.get(0));
		assertEquals(1,list.get(1));
		assertEquals(2,list.get(2));
		assertEquals(3,list.get(3));
		assertEquals(4,list.get(4));
		assertEquals(5,list.get(5));
		assertEquals(6,list.get(6));
	}
	
	
	
	
	
	
}
