package testing;

import static org.junit.Assert.assertNotNull;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//import org.junit.jupiter.api.BeforeAll;
class forTest {

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
	
	
	@ParameterizedTest
	@ValueSource(strings= {"hello", "piyu"})
	void test(String word) {
		assertNotNull(word);
		
	}
	
}

