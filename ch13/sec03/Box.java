package ch13.sec03;

public class Box<T> {
	//Field
	private T t;

	//Method
	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}
