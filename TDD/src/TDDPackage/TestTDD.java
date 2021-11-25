package TDDPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTDD {
	public String b;

	@BeforeEach
	void setUp() throws Exception 
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Wpisz dobrze");
	    String a = scan.nextLine();
	    b = a;
	}

	@Test
	void test() {
		
		switch (b)
		{
		    case "dobrze":
		    {
		    	System.out.println("No to dobrze");
		    	assertTrue(true);
		    }
		    default:
		   	{
		   		assertFalse(true);
		    }	
}
}}
