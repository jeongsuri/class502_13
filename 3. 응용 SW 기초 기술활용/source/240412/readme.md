# 변수와 자료형
## 1. 컴퓨터는 데이터를 어떻게 표현할까?
	- 반도체 
	전기 신호가 있으면 1
	전기 신호가 없으면 0
	-> 2진수
	
## 2. 10진수와 2진수
- 2진수 : 1100100
- 10진수 : 100
- bit : 1,0으로 표현할 수 있는 최소 단위
- 8bit -> 1byte

## 3. 부호있는 수를 표현하는 방법
1bit : 부호 비트 (0 - 양수, 1 - 음수)
1byte = -2^7 ~ 2^7 - 1 (-128~127)

# 변수
## 1. 변수란? 
- 변하는 수
- 공간의 이름 
- 공간 : 메모리 
- 자료형 : 메모리 크기
	메모리, 이름, 자료형
    자료형 : 공간의 크기 
	
## 2. 변수 선언하고 값 대입하기
자료형 변수명;
int 변수;	
자료형 변수명 = 값;
		
	
## 3. 변수 초기화하기
변수에 최초로 값을 대입(저장) 하는 것 
자료형 변수명 = 값;  - 선언과 동시에 초기화
	
## 4. 변수 이름 정하기
1) 알파벳, 숫자, 특수문자($, _)
2) 숫자는 변수명 앞에 사용 불가 
3) 예약어는 사용 불가(return, throw, if ...)
4) 유의미한 단어로 변수명 구성 
	
`int 1st;` - X
`int _$dollor` - O
`int noOfStudent` - O
`int throw` - X
		
		
`noOfStudent` : 카멜 표기법
`class OrderInfo` : 파스칼 표기법
		
	
# 변수의 저장공간의 특성, 자료형
## 1. 변수와 메모리
자료형 
- 기본 자료형 : 숫자를 저장하는 자료형 
- 참조 자료형 : 다른 데이터의 주소를 참조 하는 자료형 

## 2. 기본 자료형의 종류

### 1) 정수 자료형
`byte` : 1바이트(8비트) -2^7 ~ 2^7 -1 (-126~125)
`short` : 2바이트(16비트)  -2^15~2^15 - 1 
`int`    : 4바이트(32비트) -2^31~2^31 - 1
`long`  : 8바이트(64비트) -2^63~2^63 - 1
```java
short num =1;
int num =1;
long num =1;
```

### 2) 실수 자료형
소수점을 가지고 있는 숫자 
`float` : 4byte
`double` : 8byte
	
### 3) 문자 자료형
`char` : 2~3byte
```java
char ch = 'A';
```

#### 참고) 
숫자 변수에 대입 숫자 그대로 대입 
문자를 변수에 대입할 경우 '문자'

아스키코드(1byte) : 문자표
유니코드(2~3byte) : 문자표

```js
package ex01;

public class ex03 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); //>A
        System.out.println(ch1 + 1); //>66

        char ch2 = '가';
        System.out.println(ch2); //>가
        System.out.println(ch2+1);//>44033
    }
}
```
				

### 4) 논리자료형
참, 거짓 (true, false)
판별식 - 조건문 반복문에서 자주 사용
`boolean` : 1byte

## 3. 참조 자료형
자원의 주소만 가지고 있는 변수를 선언하는 자료형

# 상수와 리터럴
1. 상수 선언하기
	- 상수 : 변하지 않는 수 (constant)
	- final 예약어 변수명 앞에 추가 
	-  이름 명명 관례 
		- 대문자로 작성 
		- 단어와 단어 사이 _로 구분 
		
		 예) final int MAX_NUMBER = 10;
		
참고) final : 변경할 수 없는 
		
2. 리터럴(literal)
	
	- 리터럴 상수 
	- 재료가 되는 수 (문자, 숫자, 논리값)
	- 같은 재료 -> 하나만 생성(상수)		
	
	
	- 모든 정수를 처음에는 int 인식 
	long num = 10000000000
			
	1) int 10000000000 -> 오류 
	
	- 모든 실수를 처음에는 double 인식 
			
	
형변환
- 자료형간 변환 

1. 묵시적 형변환
	- 자동 형변환 
	- 작은 자료형 -> 큰 자료형 
	- 정수(덜 정밀한 숫자) -> 실수(더 정밀한 숫자)
	- 연산 중 자동 형변환  : 연산은 같은 자료형만 가능  -> 연산을 위해서 자동 형변환 
		
2. 명시적 형변환
	- 데이터의 유실이 발생할 가능성이 있는 경우 - 자동 형변환 X
	- 명시적으로 형변환 의사 표현 
