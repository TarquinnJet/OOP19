package lesson10.map;

public class TreeMap<K extends Comparable<K>, V > implements Map<K, V> {
	Node<K, V> root;
	private int size;

	private static class Node<K, V> {
		Node<K, V> left;
		Node<K, V> right;
		@SuppressWarnings("unused")
		Node<K, V> parent;
		K key;
		@SuppressWarnings("unused")
		V val;

		@SuppressWarnings("unused")
		public Node(V val, Node<K, V> parent) {
			this.val = val;
			this.parent = parent;
		}

		@SuppressWarnings("unused")
		public Node(V val, Node<K, V> left, Node<K, V> right, Node<K, V> parent) {
			this.val = val;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	
	private int compare(K el1, K el2) {
		return el1.compareTo(el2);
	}
	@Override
	public boolean containsKey(K key) {
		Node<K, V> tmp = root;
		while (tmp != null) {
			int cmp = compare(key, tmp.key);
			if (cmp == 0) {
				return true;
			} else if (cmp > 0) {
				tmp = tmp.right;
			} else {
				tmp = tmp.left;
			}
		}
		return false;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		this.root = null;
		size = 0;
	}

}
