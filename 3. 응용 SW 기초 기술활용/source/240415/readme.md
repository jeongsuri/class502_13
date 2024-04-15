
# 항과 연산자

## 1. 항
연산에 사용되는 값
단항연산
이항연산
삼항연산

## 2. 연산자
연산에 사용되는 기호

### 1) 대입연산자(=)
- 연산의 우선순위가 가장 낮다.
```java
int num1 = 10 + 20 * 3;
//=를 가장 늦게 실행.
```
### 2) 부호연산자(+ -)
부호를 나타내는 단항 연산자로 사용
`+`
`-` : 부호반전, 양수→음수, 음수→양수
```java
int num1= 10;// >10
int num2 = -num2;// >-10
int num2 = num1 * -1;// >-10
```

### 3) 산술연산자(+ - * / %)
사칙 연산에 사용하는 연산자
`*` `/` `%` > `+` `-`

### 4) 증감연산자(++ --)
`++` : 1씩 증가
`--` : 1씩 감소
`++num` : 대입을 먼저하고 증가
`num++` : 대입을 먼저하고 증가

```java
int num = 10;
System.out.println(num++); //>10 대입을 먼저하고 증가
System.out.println(++num); //>12 증가를 먼저하고 대입
```

### 5) 복합 대입 연산자
대입연산자 + 다른연산자(주로산술연산)
복합 대입 연산자란 대입 연산자의 다른 연산자를 조합해 하나의 연산자처럼 사용하는 연산자입니다.
`+=`, `-=`, `*=`, `/=`, `%=`

### 6) 비교연산자(관계연산자)
`<`, `<=`, `>`, `>=`
`==` : 동일성 비교 (주소비교)
`!=`

- 연산 결과 : 논리값(true, false)
- 판별식 - 조건식, 반복문

### 7) 논리연산자
`&&` : 모든 조건이 `true`일때 `true`
```java
boolean result = num >= 10 && num <=100
```
`|||` : 어느 조건중 하나 `true`일때 `true`
`!` : `true`는 `flase`로 / `false`는 `true`

- 연산자 우선 순위 : 비교연산 > 논리연산
- 단락회로 평가
```java
package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 10;
        boolean result = num++ > 10 && (num = num + 10) >15;
        //이미 앞조건이 거짓이기 떄문에 뒤에 조건은 진행하지않는다.
        System.out.println(result); // > false
        System.out.println(num); // > 11
    }
}
```

### 8) 삼항조건 연산자
`조건식 ? 참일때 거짓일때`
```java
package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num = 10;
        String str = num % 2 == 0 ? "짝수" : "홀수" ;
        System.out.println(str);
    }
}
```

### 9) 연산자의 우선순위
`대입연산자(=)` < ...< `논리` < `비교` ... < `()`



# 조건문

## 1. if
```java
if (조건식) {
	// 조건식이 참일때 실행되는 코드
}
```

## 2. else
```java
if (조건식) {
	// 조건식이 참일때 실행되는 코드
} else {
	// 조건식이 거짓일때 
}
```

## 3. esle if
```java
if (조건식1) {
	// 조건식1이 참일때 실행되는 코드 
} else if (조건식2) {
	// 조건식1 거짓 + 조건식2 참
	
} else if (조건식3) {
	// 조건식1 거짓 + 조건식2 거짓 + 조건식3 참
} else {
	// 모든 조건이 거짓일때
}
```

# 선택문
## switch case break default
키워드는 정수, int, char, ENUM상수, 문자열상수
```java
switch(키워드) {
	case 값1: 
		//키워드 == 값1 -> 실행되는 코드 
	case 값2: 
		//키워드 == 값2 -> 실행되는 코드 
}
```
```java
package exam01;
import java.sql.SQLOutput;
public class Ex04 {
    public static void main(String[] args) {
        int floor = 3;
        switch(floor){
            case 1:
                System.out.println("1층");
                break;
            case 2:
                System.out.println("2층");
                break;
            case 3:
                System.out.println("3층");
                break; // > 3층 출력
            case 4:
                System.out.println("4층");
                break;
            case 5:
                System.out.println("5층");
                break;
        }
    }
}
```
```java
package exam01;

import java.sql.SQLOutput;

public class Ex04 {
    public static void main(String[] args) {
        int floor = 6;
        switch(floor){
            case 1:
                System.out.println("1층");
                break;
            case 2:
                System.out.println("2층");
                break;
            case 3:
                System.out.println("3층");
                break;
            case 4:
                System.out.println("4층");
                break;
            case 5:
                System.out.println("5층");
                break;
            default:
                System.out.println("없는층");//> 없는층 출력

        }
    }
}

```

# 반복문

## 1. while

```java
while(조건식) {
	// 조건식이 참일때 반복 수행되는 코드 
}
```
```java
package exam01;
public class Ex05 {
    public static void main(String[] args) {
        int total = 0, num =0; // 초기화ㅣ
        while(num <= 100){ //조건식 - 반복을 멈추는 조건
            total += num; // total = total + num;
            num++; // num = num + 1
        }
        System.out.println("합계 : " + total);
        //>합계 : 5050
    }
}

```
## 2. do ~ while
```java
do {
	// 조건식이 참일때 반복 수행되는 코드 
	// 조건식이 거짓 이라고 하더라도 한번은 실행
} while(조건식);
```

## 3. for
```java
for (초기화식; 조건식; 증감식) {
	// 조건식이 참일때 반복 수행되는 코드
}
```

```java
package exam01;
public class Ex06 {
    public static void main(String[] args) {
        int total = 0;
        for(int num =0; num<=100;num++){
            total += num;
        }
        System.out.println(total);
    }
}

```

`break` : 반복 중단
`ontinue` : 반복 건너뛰기 - 현재 반복을 중단, 새로 시작

1,3,5,7,9,11,13 ...  // 2n + 1 -> 2로 나누었을때 나머지가 1인 경우 -> 홀수

# index
- 횟수, 순서(index)
- 관례적으로 초기화식 변수명 i 부터 시작하고 다음 알파벳 부터 순서대로 사용 (i, j, k, l ....)

## 중첩 반복문
반복문 안에 반복문
```java
package exam01;

public class Ex08 {
    public static void main(String[] args) {
        for(int i =2;i<=9;i++){
            for(int j = 1;j<=9;j++){
System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
```


# 참고

- `System.out.println(값);`  : 출력 + 줄개행(\n)
- `print(값)` : 출력 (줄개행 X)
- `println()` : 줄개행(\n)
- `printf(형식화)`
  - f : format
  - `%s` -> 문자열 대체
  - `%d` -> 정수 대체 / decimal
  - `%f` -> 실수 대체 / float
  - `%n` -> 줄개행 / ￦ｎ

```java
package exam01;

public class Ex08 {
    public static void main(String[] args) {
        for(int i =2;i<=9;i++){
            for(int j = 1;j<=9;j++){
//                System.out.println(i+"*"+j+"="+i*j);
                System.out.printf("%d X %d = %d \n",i,j,i*j);
            }
        }
    }
}
```
