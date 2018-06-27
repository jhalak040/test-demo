package testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;

//import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)

@SelectClasses( {} )
//@IncludeTags({"calTest"})
public class AllTests {
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
		
		System.out.println("Square Test");
	}
}
