package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {
	
	//추상 메소드 재정의
	@Override
	public void methodA() {
		System.out.println("interfaceCImpl_methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("interfaceCImpl_methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("interfaceCImpl_methodC() 실행");
	}
	
}
