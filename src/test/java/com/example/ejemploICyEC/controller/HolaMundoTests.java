package com.example.ejemploICyEC.controller;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HolaMundoTests {
	
	@Test
	void holamundoTest() {
		assertEquals("Hola Mundo", HolaMundo.home());
	}
}
