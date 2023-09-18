package testNGlistener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listner {

	@Test  
	public void testtopass()  
	  {  
	   Assert.assertTrue(true);  
	    }  
	@Test  
	public void testtofail()  
	   {  
	Assert.assertFalse(true);  
         }
}
