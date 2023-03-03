package chapter20_tryCatch;

import javax.swing.plaf.metal.MetalMenuBarUI;

class Member{
    String memberID;
    String name;
    String phone;

    public Member(String memberID, String name, String phone) {
        this.memberID = memberID;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return memberID +" : "+name ;
    }
}
public class problem05 {
    public static void main(String[] args) {
        Member member = new Member("blue", "이파란","010-1234-5678");
        System.out.println(member);
    }
}
