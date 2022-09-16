package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) throws Exception {
	/*	//리소스 열기(객체 생성)
		MyResource res1 = new MyResource("res1");
		//리소스 읽기
		System.out.println(Integer.parseInt(res1.read1())); //100
		System.out.println(Integer.parseInt(res1.read2())); //abc
		//리소스 닫기
		res1.close(); //예외처리를 통해 안전하게 닫아줘야함! */
		
		MyResource res1 = null;
		try {
			//리소스 열기(객체 생성)
			res1 = new MyResource("res1");
			//리소스 읽기
			System.out.println(Integer.parseInt(res1.read1())); //100
			System.out.println(Integer.parseInt(res1.read2())); //abc
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//리소스 닫기
			res1.close();
		}
		
		System.out.println("=======================================================");

		try(MyResource res2 = new MyResource("res2")) {
			System.out.println(Integer.parseInt(res2.read1())); //100
			System.out.println(Integer.parseInt(res2.read2())); //abc
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=======================================================");
		
		MyResource res3 = new MyResource("res3");
		try(res3) {
			System.out.println(Integer.parseInt(res3.read1())); //100
			System.out.println(Integer.parseInt(res3.read2())); //abc
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=======================================================");

		MyResource res4 = new MyResource("res4");
		MyResource res5 = new MyResource("res5");
		try(res4;res5) {
			System.out.println(Integer.parseInt(res4.read1())); //100
//			System.out.println(Integer.parseInt(res4.read2())); //abc
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	
	
	}

}
