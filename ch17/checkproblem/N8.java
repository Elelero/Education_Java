package pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pratice {
	
	//field
	private String name;
	private String job;
	//constructor
	public Pratice(String name, String job) {
		this.name = name;
		this.job = job;
	}
	// getter method
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	// method overriding
	@Override
	public String toString() {
		return "{name: " + name + ", job: " + job + "}";
	}
	
	//main method
	public static void main(String[] args) {
		//List Collection 생성
		List<Pratice> list = Arrays.asList(
				new Pratice("홍길동", "개발자"),
				new Pratice("동길동", "디자이너"),
				new Pratice("서길동", "개발자")
				);
		
		//Stream 얻기
		Map<String, List<Pratice>> groupingMap = list.stream()
				.collect( Collectors.groupingBy(s -> s.getJob()) );
		
		System.out.println("[개발자]");
		List<Pratice> developerList = groupingMap.get("개발자");
		developerList.stream().forEach(s->System.out.println(s.toString()));

		System.out.println("\n");
		
		System.out.println("[디자이너]");
		List<Pratice> designerList = groupingMap.get("디자이너");
		designerList.stream().forEach(s->System.out.println(s.toString()));
	}
}
