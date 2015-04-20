package lesson8.HW;

public abstract class AbstractList<E> implements List<E>{

	@Override
	public boolean contains(Object o) {
		return indexOf(o)!= -1 ? true : false;
	}

	@Override
	public boolean isEmpty() {
		return size()!=0 ? false : true;
	}
}
