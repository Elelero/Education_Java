package ch06.sec11.exam02;

public class Earth {
	//상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	//상수 선언
	static final double EARTH_SURFACED_AREA;
	
	//정적블록에서 상수 초기화
	static {
		//Math.PI는 자바에서 제공하는 상수
		EARTH_SURFACED_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
