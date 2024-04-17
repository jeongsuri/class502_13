# this
- - -
- 모든메서드에 존재하는 지역변수
- 객체의 자원을 접근하기 위해서 객체의 주소값이 담겨있음.
- 객체의 자원을 소비하기위한 수단

```java
package exam01;
public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(40);

        s1.printThis();
        //> exam01.Schedule@10f87f48
        System.out.println(s1);
        //> exam01.Schedule@10f87f48
    }
}
//Schedule의 this를 출력하면 s1과 같다.
//this와 s1은 똑같은 주소를 가르키고 있다.
```

<br>

```java
public void setYear(int year) {
        this.year = year;
        //this.year은 힙에 있는 멤버변수
        //year은 스택에 있는 변수(메서드 내부에 있는 지역변수)
    }
```



<br>

- 지역변수
	- 생성된 객체의 주소값
    - 인스턴스 메서드의 지역변수
    - 메서드 내부에서 객체의 자원을 접근하기 위한 주소값
<br>
- 메서드 : this(...)
	- 클래스 내부에서 정의된 생성자를 호출
    - 객체생성X, 생성자에 정의한 코드를 실행
    - 생성자 메서드 내부에서 주로 사용
	- 생성자 메서드를 다른 생성자에서 호출
	- 생성자 메서드의 첫번째 라인 에서만 정의 가능
    
 ```java
 public Schedule(){
        this(2024,4,17);
    }
    public Schedule (int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
 ```
    
    <br>
    

# static 
- - -
## 1. 메모리
- 정적메모리
	- 데이터영역
    - 변하지 않는 데이터
    - 코드, 상수 영역
    - 애플리케이션 시작시 생성, 종료시 제거
- 동적메모리
	- 스택
    - 힙
## 2. static 변수
- 정적변수
- 처음 로드 될때 부터 데이터영역(정적메모리)에 할당(힙에 존재하지않음)
- 객체 생성과 상관없이 호출 가능
- **데이터 영역에 할당, 같은 자원을 사용하기 때문에 모든 객체에서 공유가 가능.**
- 클래스명으로 접근 가능(클래스변수)
	- `클래스명.static변수` ex) `Student.id`
  

## 3. static 메서드
- 객체 생성과 상관없이 호출 가능
- 클래스명으로 접근 가능(클래스 메서드)
- this 지역변수 사용하지 못함 → **객체의 자원 접근 X**
- 반대로 인스턴스 자원에서 접근가능(static 변수는 인스턴스자원보다 먼저 생성되어있기때문에)
```java
public static void staticMethod(){
        System.out.println("정적메서드");
    }
    
    
public static void main(String[] args) {
	Student.staticMethod(); 
    }
```

메인내부의 메서드를 접근하기 위해서는 스태틱메서드로 정의해야한다.

# 변수의 유효범위
1. 지역변수
	- 함수가 호출, 실행시에만 스택에 공간 할당
    - 함수의 연산이 종료되면 return, 스택에서제거
	- 메서드 지역에서만 유효
2. 멤버변수(인스턴스 변수)
	- 객체 생성시 힙 메모리에 생성
    - 객체의 참조가 끊어지면(더 이상 참조변수 없으면 가비지 콜렉터가 제거)
3. static 변수
	- 애플리케이션이 로딩시 생성(데이터 영역)
    - 애플리케이션이 종료되면 제거

# 싱글톤 패턴

메모리를 절약하는 방법 패턴
편의 기능 모음 클래스의 경우는 객체를 여러개 생성할 필요 X → 메서드나, 변수, 상수를 static으로 정의한 경우가많다.

### 문제점
처음부터 공간 할당, 활성화 → 사용하지 않아도 이미 메모리를 차지

### 해결방법
싱글톤 패턴

### 싱글톤패턴
1) 기능을 담당하는 객체는 여러개 만들 필요 없다.
2) 필요할 때만 객체를 생성하고 사용.
3) 객체는 필요할때 하나만 생성, 공유

### 만드는방식
1) 생성자를 외부에서 직접 호출 x (접근제어자 private변경)
2) 클래스 내부에서 객체를 생성
3) 클래스 내부에 생성된 객체를 반환하는 함수 생성(get, set)

