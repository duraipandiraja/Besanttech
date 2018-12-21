package TestCase;



import org.apache.log4j.Logger;
import org.testng.annotations.Test;



import TestBase.TestBase;

public class Page1_TestCase extends TestBase {
	
	Logger log = Logger.getLogger(Page1_TestCase.class.getName());
	
	@Test
	public void test1(){
		
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
	}
	
	@Test
	public void test2(){
		
	}
	
	@Test
	public void test3(){
		
	}



}
