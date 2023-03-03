package chapter20_tryCatch;
/*int hashcode() : 메모리에 생성된 인스턴스의 주소값을 가지고 일련번호를 만들어
* 반환하는 메서드, 이퀄즈의 판단 기준은 해시 코드 값이고 이갓은 hashcode()에서 가지고 옴
* 객체의 해시 코드 값을 반환.
*
* 자바에서는 인스턴스를 한 메모리 안에 생성 하여 관리 할때 해시 알고리즘을 사용
* 오브젝트 클래스의 투 스트링 메서드 워ㄴ형을 다시 살펴 보면
* getClass().getName() + "@" +Integer.toHexString(hashcode() )
* 즉 우리가 참조변수를 출력할 때 본 16진수 숫자 값이 '해시코드'값이고,
* 이 값은 자바 가상 머신이 힙 메모리에 지정한 '인스턴스 주소 값'
* 그래서 자바에서는 두 인스턴스 가 같다면 hashcode()에서 반환 하는 해시코드 값이 같아야함.*/

public class test10 {
    public static void main(String[] args) {
        Comp comp1 = new Comp("비교1");
        Comp comp2 = new Comp("비교2");
        System.out.println(comp1.hashCode());//false 주소값 비교
        System.out.println(comp2.hashCode());//false 이퀄즈도 주소갑비교


        String str1=new String("abc");
        String str2=new String("abc");

        System.out.println(str1.hashCode()); //false 두 스트링 인스턴스 주소값ㅅ을 다름
        System.out.println(str2.hashCode());// true 재정의 됨

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);


        System.out.println(i1.hashCode());//false 주소값은 다름
        System.out.println(i2.hashCode());//true 재정의됨.
    }

}
