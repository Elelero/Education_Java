package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i=0; i<=1000000; i++) {
			sum += i;
		}
		
		long runTime1 = System.nanoTime();
		long runTime2 = System.currentTimeMillis();
		
		System.out.println("1~1000000까지의 합은..? => " + sum);
		System.out.println("계산에 " + (runTime1-time1) + " nano초가 소요됨");
		System.out.println("계산에 " + (runTime2-time2) + " milli초가 소요됨");
	}

}
