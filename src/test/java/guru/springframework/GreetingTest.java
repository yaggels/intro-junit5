package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTest {
    
    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("======Before everything=====");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("********After everything********");
    }

    @BeforeEach
    void setup(){
        System.out.println("In Before Each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld(){
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Chow"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each");
    }
}