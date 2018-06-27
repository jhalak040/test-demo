package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeAll;
class squareTest {

	@BeforeAll
	static void BeforeAll(){
		System.out.println("@BeforeAll executed");
	}
	@AfterAll
	static void AfterAll(){
		System.out.println("@AfterAll executed");
	}
	@BeforeEach
	 void BeforeEach(){
		System.out.println("@BeforeEach executed");
	}
	@AfterEach
	void AfterEach(){
		System.out.println("@AfterEach executed");
	}
	
	@Test
	void test() {
		junitTesting test = new junitTesting();
		int output= test.square(5);
		assertEquals(25, output);
		System.out.println("Square Test");
	}
	
}
