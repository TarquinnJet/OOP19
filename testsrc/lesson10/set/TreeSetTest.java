package lesson10.set;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeSetTest {
	
	TreeSet<Integer> treeSet = new TreeSet<>();

	@Test
	public void shouldAddAndRemove(){
		assertTrue(treeSet.add(12));
		assertTrue(treeSet.remove(12));
	}
	

}
