package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
		
	//field
	public String name;
	public int age;
		
	//constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//method (오름차순)
	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age==o.age) return 0;
		else return 1;
	}

//	//method (내림차순)
//	@Override
//	public int compareTo(Person o) {
//		if(age<o.age) return 1;
//		else if(age==o.age) return 0;
//		else return -1;
//	}

}
