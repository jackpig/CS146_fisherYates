import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Zhijie
 *
 */

public class test {
	@Test
	
	void testL2L() throws IOException{
	BufferedReader Out = new BufferedReader (new FileReader ("Target2.txt"));

	BufferedReader In = new BufferedReader (new FileReader ("out.txt"));          

	String expectedLine;
	while ((expectedLine = In.readLine ()) != null) {

	               String actualLine = Out.readLine ();

				assertEquals (expectedLine, actualLine);
 
	 }
	}

	 
}
