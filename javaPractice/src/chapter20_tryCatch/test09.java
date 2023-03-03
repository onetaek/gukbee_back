package chapter20_tryCatch;

/*boolean equals (Object obj): 두 인스턴스가 동일한지 여부를 반환
재정의 하여 논리적으로 동일한 인스턴스임을 정의할수 있음 equals메서드의 원래 기능은
* 두 인스턴스의 주소값을 비교하여 boolena 값을 트루/포스를 반환해 주는것
* 주소 값이 같다면 당연히 같은 인스턴스 이지만 서로 다른 주소를 가질 때에도
같은 인스턴스라도 정의 할 수 있는 경우가 있음 따랄서 물리적
* 통일 성(인스턴스 메모리 주소가 같은)뿐 아니라 논리적
통일성(논리적으로 두 인스턴스가 같은)을 구현할때도 equals 메서드를 재정의 하여 사용 */

class Comp{
    String name;

    public Comp(String name) {
        this.name = name;
    }
}

public class test09 {

    public static void main(String[] args) {

        Comp comp1 = new Comp("비교1");
        Comp comp2 = new Comp("비교2");
        System.out.println(comp1==comp2);//false 주소값 비교
        System.out.println(comp1.equals(comp2));//false 이퀄즈도 주소갑비교


        String str1=new String("abc");
        String str2=new String("abc");

        System.out.println(str1==str2); //false 두 스트링 인스턴스 주소값ㅅ을 다름
        System.out.println(str1.equals(str2));// true 재정의 됨

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);


        System.out.println(i1==i2);//false 주소값은 다름
        System.out.println(i1.equals(i2));//true 재정의됨.

        i1=i2;
        System.out.println(i1==i2);
    }
}
