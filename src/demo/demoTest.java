package demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
@DisplayName("junit testing")
class demoTest {
	@Tag("calTest")
	@Test
	void test() {
		demo c= new demo();
		int output= c.Cal(5,5);
		assertEquals(10, output);
		System.out.println("Test Method");
	}

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
	 void test1(){
		Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Array Equal Test");
		System.out.println("@Test1 executed");
	}
	
	@Test
	 void test2(){
		Assertions.assertThrows(NumberFormatException.class, () -> {
		    Integer.parseInt("one");
		  });
		System.out.println("@Test2 executed");
	}
	@Disabled
	@RepeatedTest(5)
	@Test
	 void test3(){
		System.out.println("@Test3 executed");
	}
	
	@Test
	void test4()
	{
	     Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4));
	     Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3,4));
	     //Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1,2,3));
	     
	      
	    //Test will pass
	    Assertions.assertIterableEquals(listOne, listTwo);
	     
	    //Test will fail
	    //Assertions.assertIterableEquals(listOne, listThree);
}
	
	
	@Test
	void test5()
	{
		System.setProperty("ENV","PROD");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
	}
}
