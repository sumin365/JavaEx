package com.javaex.oop.staticmember.a6; //????????????????????????????????????????이해안감  0304 140215동영상
//03번ppt- 31p/62  
public class StaticEx {
	//	클래스 변수(static)
	//		: 모든 인스턴스에서 공유
	//		: static -> instance (X)
	//		: instance -> static (O)
	public static int refCount;
	public static String classVar;
	//	인스턴스 변수
	//		: 개별 객체 내부에서만 접근
	public String instanceVar;
	
	//	static 영역 초기화는 static 블록에서
	//	클래스가 로드될 때 단 한번 실행
	static {
		refCount = 0;
		classVar = "클래스 변수";
		System.out.println("=> Static Block");
//		instanceVar = "인스턴스 변수";	//	static -> instace 멤버 (X)
	}
	
	//	생성자
	public StaticEx() {
		refCount++;	//	instance -> static (O)
		System.out.println("=> Instance 생성");
		System.out.println("=> 참조 Count:" + refCount);
	}
	
	//	소멸자
	//아래 나오게 하는 방법 
	//finalize 하고 ctrl+space바 누르면 맨위에꺼 누르면 된다. 
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("소멸자 호출");
		super.finalize();
	}
}