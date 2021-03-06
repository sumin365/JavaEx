package com.javaex.api.generics.v3.a14;
//ppt04-43p/69  

	//Generic
	//설계시에는 내부 타입을 지정하지 않고 
	//-> 인스턴스화 할 떄 내부 타입을 지정해주는 방식 

    //템플릿 문자
	//T: Type 내부데이터 타입
	//R: Return Type 리턴 타입 결정시
	//K: Key  키를 명시 할떄 
	//V: Value  
	//... 다양한 템플릿 문자를 사용할 수 있다
	public class GenericBox<K, V> { // 내부에서 사용할 Key, Value의 타입을 미정 상태로 설게
	K key;
	V content;
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getContent() {
		return content;
	}
	
	public void setContent(V content) {
		this.content = content;
	}
	
	}
