package org.com.ksyoo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyMathTest {
    @BeforeAll
    public void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after");
    }

    @AfterAll
    public void afterAll() {
        System.out.println("after all");
    }

    @Test
    public void sum_with_three_numbers() {
        System.out.println("sum_with_three_numbers");
        MyMath myMath = new MyMath();
        var result = myMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with_only_one_number() {
        System.out.println("sum_with_only_one_number");
        MyMath myMath = new MyMath();
        var result = myMath.sum(new int[]{3});
        assertEquals(3, result);
    }

    @Test
    public void test1() {
        System.out.println("test1");
        boolean cond = false;
        assertEquals(true, true);
        assertFalse(cond);
        assertNotNull(cond);
    }

    @Test
    public void test2() {
        System.out.println("test2");
        var arr1 = new int[]{1, 3, 7};
        var arr2 = new int[]{1, 3, 7};
        assertArrayEquals(arr1, arr2);
    }
}
