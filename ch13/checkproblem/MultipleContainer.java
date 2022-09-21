package ch13.checkproblem;

public class MultipleContainer<T1, T2> {
	//field
	public T1 key;
	public T2 value;
	
	//method
	public void set(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
	public T1 getKey() {
		return key;
	}
	public T2 getValue() {
		return value;
	}
}
