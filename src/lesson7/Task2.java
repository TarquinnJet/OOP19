package lesson7;

public class Task2 {
	public static void main(String[] args) {
		//WithVersion<String> s = new WithVersion<>("yt", 13);
	}
}

class WithVersion<T> {
	private final T value;
	private final long version;

	public WithVersion(T value, long version) {
		this.value = value;
		this.version = version;
	}

	public long getVersion() {
		return version;
	}

	public T getValue() {
		return value;
	}
}