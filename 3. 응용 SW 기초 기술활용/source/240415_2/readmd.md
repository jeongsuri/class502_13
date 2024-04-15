# 배열
## 1. 배열이란?
- **같은 자료**형(공간의 크기가 동일)
- 물리적인 나열 구조(**순차 자료** 구조)

## 2.  배열 선언과 초기화
```java
자료형[] 배열명 = new 자료형[공간의 갯수];
자료형 배열명[] = new 자료형[공간의 갯수];
```


## 3.  배열 사용하기
**인덱스 연산자**
`[]` : 배열 공간의 위치를 계산해 주는 연산자


선언과 동시에 초기화
```java
자료형[] 배열명 = new 자료형[] { 값1, 값2, 값3 ....};`
자료형[] 배열명 = { 값1, 값2, 값3 .... };
```
```java
public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; //int형 변수를 4개생성
        // nums[0], nums[1], nmus[2], nums[3]
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        System.out.println(nums[0]); //10
        System.out.println(nums[1]); //20
        System.out.println(nums[2]); //30
        System.out.println(nums[3]); //40     
    }
}
```

참고)
기본 자료형 : 초기값
정수형 자료형(byte, short, int, long) -> 0
실수형 자료형(float, double) -> 0.0
논리형 자료형(boolean) -> false

	참조 자료형 
		예) String - 초기값 null 


## 4. 전체 배열 길이와 유효한 값
`length` : 공간의 갯수
```java
package exam01;
public class Ex04 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70};
        for (int i = 0 ;i < nums.length -1; i++){
            System.out.println(nums[i]);
        }
    }
}

```

## 5. 향상된 for문과 배열
```java
public class Ex05 {
    public static void main(String[] args) {
        String[] strs = {"가나","다라","마바"};
        for (String str : strs){
            System.out.println(str);
        }
    }
}
```

```java
public class Ex06 {
    public static void main(String[] args) {
        int[][] nums = {{10, 20, 30},{40,50,60}};
        System.out.println(nums);
        System.out.println(nums.length); //>2(행의갯수)
        System.out.println(nums[0].length);//>3(열의갯수)
        System.out.println(nums[1].length);//>3(열의갯수)

        for(int i = 0; i < nums.length; i++){ //행
            for(int j = 0; j < nums[i].length; j++){
                System.out.println(nums[i][j]); //i행,j열
            }
        }
    }
}

```

## 6. 다차원배열
1차원배열 : 직선

2차원배열 : 면
- `자료형[ ][ ] 배열명 = new 자료형[행][열]`

3차원배열 : 입체
- `자료형[ ][ ][ ] 배열명 = new 자료형[높이][가로][세로];`


## 7. 참고
```java
public class Ex07 {
    public static void main(String[] args) {
        String[] strs = {"가나","다라","마바"};
        int[][] nums = {{1, 2, 3} , {4, 5, 6}};
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.deepToString(nums));
    }
}
```