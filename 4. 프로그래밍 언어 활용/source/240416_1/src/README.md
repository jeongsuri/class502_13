# 생성자
- 클래스명과 동일한 명칭의 함수 
- 객체를 생성해 주는 역할 

데이터 영역 메모리(코드 & 상수 영역 메모리)

클래스 로더 -> 클래스 파일 -> 데이터 영역 로드 

## 1. 디폴트 생성자(기본 생성자)
클래스에 생성자 메서드가 정의된 것이 없으면 -> 컴파일러가 자동 추가
```java
public 클래스명() { //기본 생성자
	//객체가 생성된 이후 실행 코드
    //실행 시점 : id, name, subject에 공간을 할당 받은 상태
    //주로 인스턴스 변수의 초기화 작업을 주로 수행한다.
}
```
```java
public class Student {
    int id;
    String name;
    String subject;

    public Student(){//기본생성자(default 생성자)
        System.out.println("객체 생성 이후 실행");
        id=1000; //인스턴스 변수의 초기화
        name="이이름"; //인스턴스 변수의 초기화
        subject="자바"; //인스턴스 변수의 초기화
    }

    void study(){
    //1) 객체 생성 2) 호출 - 호출시점에는 인스턴스 변수가 이미 공간 할당
        System.out.printf("학번 %d, %s가 %s를 공부한다",id,name,subject);
    }
```
```java
public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study(); 
        //>위에 디폴트생성자로 인해 초기화된 인스턴스 변수들이 출력된다.
        //함수가 실행되려면 우선객체가 먼저 생성되어야한다.
    }
}
```
```java
public Student(int _id, String _name, String _subject){//기본생성자(default 생성자)
        //클래스가 이미 정의되어있으면 정의되어주지않는다. 정의가 되지않을때만 한다.
        id = _id;
        name = _name;
        subject = _subject;
        }
```
		
## 2. 생성자 오버로드
생성자 오버로드 : 클래스에서 생성자가 두개 이상 제공되는 경우
- 필요에 따라 매개변수가 다른 생성자를 여러 개를 만들 수 있다
- 클래스에 생성자를 여러 개 제공하면 이 클래스를 사용하는 코드에서는 원하는 생성자를 선택해 사용할 수 있습니다.
- 경우에 따라서는 클래스에서 일부러 디폴트 생성자를 제공하지 않기도 합니다.
- **객체지향 프로그램에서 메서드 이름이 같고 매개변수만 다른 경우를 오버로드라고 합니다.**
```java
public class Ex06 {
    public static void main(String[] args) {
        int result1 = add(10,20);
        System.out.println(result1);
        int result2 = add(10,20,30);
        System.out.println(result2);
    }
    static int add(int num1, int num2){
        return num1 + num2;
    }
    static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
```
### 함수의 이름
패키지명 + 클래스명 + 반환값  + 함수명 + 매개변수 정의 + 예외 전가
함수의 시그니쳐가 동일O → 함수의 중복 정의 → 오류
함수의 시그니쳐가 동일X → 함수명이 같아도 다른 함수를 정의

# 정보 은닉
> 멤버 변수에 직접 값을 대입을 지양해야한다.
why? 통제가 불가능하기 때문에!

- (멤버 변수의 접근 제어자(private))
- 멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set) → 제어가능

## 1. 접근제어자
`public` : 모든 패키지에서 접근이 가능
`protected` : 동일 패키지에서 접근 가능(default) + 외부 패키지에 있는 클래스에서 상속을 받으면 클래스 내부에서 접근 가능(private)
`default` : 동일 패키지에서 접근 가능(접근 제어자 명시 X)
`private` : 클래스내부의 메서드 내에서만 접근 가능

<br>

- public
```java
package exam03;
public class Ex01 {
    public static void main(String[] args) {
        exam02.A a = new exam02.A(); //
        // 다른 패키지 : 클래스이름앞에 패키지를 써야한다
        // 같은 패키지 : 생략가능
        // A a = new A(); //오류
    }
}
```
```java
package exam03;
import exam02.A;
public class Ex01 {
    public static void main(String[] args) {
        A a = new A(); 
        //다른패키지이지만, import 사용하면 생략가능
    }
}

```
<br>

- default
```java
package exam02;

public class A { //exam02.A
    public int numA;
    int numAA; // default 접근 제어자, 동일패키지만 접근가능.
}
```
```java
package exam03;
import exam02.*;
public class Ex01 {
    public static void main(String[] args) {
        //exam02.A a = new exam02.A(); //
        // 다른 패키지 : 클래스이름앞에 패키지를 써야한다
        // 같은 패키지 : 생략가능
        A a = new A(); //다른패키지이지만, import 사용하면 생략가능
        B b = new B();
        a.numA=5;
        //a.numAA=5; 오류
        }
}
```

### 참고)
- 다른 패키지에 있는 클래스를 사용하려면 import
import 패키지명.클래스명;
- **하위 패키지도 다른패키지로 취급.**
		
## 2. get(), set() 메서드
멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set) → 제어가능

<br>

- set( )
```java
public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        year = _year;
    }

    public void setMonth(int _month){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        month = _month;
    }

    public void setDay(int _day){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        day = _day;
    }

    void showDate(){
        System.out.printf("year : %d, month : %d, day : %d\n",year,month,day);

    }
}
```
```java
package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);
        s1.showDate();
    }
}
```

<br>

- get( )

```java
package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        year = _year;
    }
    public void setMonth(int _month){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        month = _month;
    }
    public void setDay(int _day){ //멤버 변수의 값을 확인할 수 있는 접근 가능한 메서드 추가(set)
        if(month == 2 && _day>28){
            _day=28;
        }
        day = _day;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    void showDate(){
        System.out.printf("year : %d, month : %d, day : %d\n",year,month,day);

    }
}
```
```java
package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        int year = s1.getYear();
        int month = s1.getMonth();
        int day = s1.getDay();
        System.out.printf("%d %d %d\n",year,month,day);

        s1.showDate();
    }
}
```

this 예약어		 
static 변수

변수의 유효범위
1. 지역변수 
2. 멤버변수(인스턴스 변수)
3. static 변수 

static 응용 - 싱글톤 패턴
