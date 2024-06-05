package exam01;

import org.junit.jupiter.api.*;

@Tag("exercise")
public class Ex02Test {

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }

    @Test
    void test1(){
        System.out.println("테스트1번 진행");
    }

    @Test
    void tes2(){
        System.out.println("태스트2번 진행");
    }
}
