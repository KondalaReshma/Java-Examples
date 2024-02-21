package junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
class TEST {
	@BeforeClass
    public static void printBeforeAllTestCases()
    {
            System.out.println("This method is executing before the execution of all the test caes");
    }
    @AfterClass
    public static void printAfterAllTestCases()
    {
            System.out.println("This method is executing after the execution of all the test caes");
    }
    
    @Before
    public  void printBeforeAnyTestCase()
    {
            System.out.println("This method executes before the execution of a test case");
    }
    
    @After
    public  void printAfterAnyTestCase()
    {
            System.out.println("This method executes after the execution of a test case");
    }

    @Test

	
	void test() {
		//fail("Not yet implemented");
    	  int[] array= {1,2,3,4};
          assertEquals(1,MinFinder.findMin(array));
  }
	}


