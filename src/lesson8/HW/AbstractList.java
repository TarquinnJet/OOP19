package lesson8.HW;

public abstract class AbstractList<E> implements List<E> {

	@Override
	public boolean contains(Object o) {
		return indexOf(o) != -1 ? true : false;
	}

	@Override
	public boolean isEmpty() {
		return size() != 0 ? false : true;
	}

	@Override
	public boolean addAll(List<? extends E> list) {
		for (int i = 0; i < list.size(); i++) {
			this.add(list.get(i));
		}
		return list.size() == 0 ? false : true;
	}
//можно оптимизировать. достаточно связать только точки соприкосновения.
	@Override
	public boolean addAll(int idx, List<? extends E> c) {
		if (idx >= 0 & idx < size()) {
			for (int i = 0; i < c.size(); i++) {
				this.add(idx, c.get(i));
				idx++;
			}
		} else {
			throw new IndexOutOfBoundsException("wrong idx");
		}
		return c.size() == 0 ? false : true;
	}
}
