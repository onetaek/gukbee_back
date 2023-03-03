package chapter20_tryCatch;

class Student{
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){//동일한 클래스의 객체이면
            Student std = (Student) obj;//student클래스로 형변환
            if(studentID == std.studentID){//이 객체의 학번과 매개변수로 들어온 학번이 같으면 true반환
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}

public class test11 {
    public static void main(String[] args) {

        Student studentLee = new Student(100,"이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100,"이상원");
        if(studentLee == studentLee2){
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        }else{
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }
        if(studentLee.equals(studentLee2)){
            System.out.println("studentLee와 studentLee2는 동일인물입니다.");
        }else{
            System.out.println("studentLee와 studentLee2는 동일 인물이 아닙니다.");
        }
        if(studentLee == studentSang){
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        }else{
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
        }
        if(studentLee.equals(studentSang)){
            System.out.println("studentLee와 studentSang는 동일인물입니다.");
        }else{
            System.out.println("studentLee와 studentSang는 동일 인물이 아닙니다.");
        }

        System.out.println("studentLee의 해시; "+ studentLee.hashCode());
        System.out.println("studentSang의 해시; "+ studentSang.hashCode());

        System.out.println("studentLee의 실제 주소값: "+ System.identityHashCode(studentLee));
        System.out.println("studentSang의 실제 주소값: "+ System.identityHashCode(studentSang));

    }
}
