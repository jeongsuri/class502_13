package exam03;

public class HighSchoolStudent extends Student{
    //Student stu =new Student(15,"김정훈");
    public HighSchoolStudent(){
        super(15,"이름"); //super는 상위클래스를 생성하기떄문에 상위클래스의 생성자 매개변수를 지정해야함

    }
    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
