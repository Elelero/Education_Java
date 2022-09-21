package ch13.checkproblem;

public class Pair<K, V> {
	//field
	private K key;
	private V value;
	
	//constructor
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	//method
	public K getKey() { return key;	}

	public V getValue() { return value; }
	
	
}
