package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.Task1;

public class Testdiv {
	@Test
	public void div_fun()
	{
		Task1 a=new Task1();
		Assert.assertEquals(1, a.div_10(5,9,2));
		
}

}
