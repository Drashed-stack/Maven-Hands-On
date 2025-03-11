package com.example.demo1; // Ensure it matches your main application package

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Demo1Application.class) // Explicitly specify the main class
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
    }

}

