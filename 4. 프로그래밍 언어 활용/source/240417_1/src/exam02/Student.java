package exam02;

public class Student {
    public static int id;
    private  String name;
    private  String subject;

    public Student(){}

    public Student(int id, String name, String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public static void staticMethod(){
        //객체와 상관없이 사용, this 지역변수 x → 객체의 자원 접근 X
        System.out.println("정적메서드");
    }
    public static void staticMethod1(){
        //객체와 상관없이 사용, this 지역변수 x → 객체의 자원 접근 X
        System.out.println("정적메서드");
    }
    public void instanceMethod(){
        System.out.println("인스턴스메서드");
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
