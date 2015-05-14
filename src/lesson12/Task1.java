package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
public static void main(String[] args) {
	Collection<Integer> list = new TreeSet<>();
	for (int i = 0; i < 10; i++) {
		list.add(i);
	}
	print(list);
}
	public static void print(Collection<Integer> collection){
		Iterator <Integer> iter = collection.iterator();
		while (iter.hasNext()) {Integer i = iter.next(); System.out.println(i);}
	}

}
