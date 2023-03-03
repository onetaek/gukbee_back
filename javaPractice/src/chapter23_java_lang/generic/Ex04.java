package chapter23_java_lang.generic;

//제네릭은 C++의 템플릿이 발전한 형태.
//C++과는 달리 제네릭 대신 Object를 사용하면 모든 데이터 타입을 사용할 수 있지만, 경우에 따라 형 변환 해줘야 되서 제네릭을 선ㅇ호.

class CommonData<T>{
	private T data; //클래스의 데이터 타입이 Object라서 모든 데이터 타입이 사용 가능.
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		CommonData<String> stringCommonData = new CommonData<String>();
		CommonData<Integer> integerCommonData = new CommonData<>();//<>안에 타입 생략가능
		stringCommonData.setData("abc");
		integerCommonData.setData(100);
		System.out.println("stringCommonData : "+stringCommonData.getData());
		System.out.println("integerCommonData : "+integerCommonData.getData());
	}
}