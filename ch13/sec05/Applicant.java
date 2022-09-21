package ch13.sec05;

public class Applicant<T> {
	//field
	public T kind;
	
	//constructor
	public Applicant(T kind) {
		this.kind = kind;
	}
}
