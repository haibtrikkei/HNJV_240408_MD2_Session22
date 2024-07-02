package code_source;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    MyClass obj = new MyClass();

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all method test");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all method test");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each method test");
    }

    @Test
    @DisplayName("Test cong - 1")
    void cong1() {
        System.out.println("Test cong - 1");
        assertEquals(10,obj.cong(5,5));
        assertNotNull(obj);
    }

    @Test
    @DisplayName("Test cong - 2")
    void cong2() {
        System.out.println("Test cong - 2");
        assertEquals(7,obj.cong(3,4));
    }

    @Test
    @DisplayName("Binh phuong - case 1")
    void binhphuong() {
        System.out.println("Binh phuong - case 1");
        assertEquals(4, obj.binhphuong(2));
    }
}