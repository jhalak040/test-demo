package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class countATest {

	
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
	@Tag("count")
	void test() {
		junitTesting test = new junitTesting();
		int output= test.countA("priyanka");
		assertEquals(2, output);
		System.out.println("Count Test");
	}

}
