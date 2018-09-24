import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * test main_seed20 with given file target2
 */

/**
 * @author Zhijie
 *
 */

public class test {
	@Test
	/**
	 * main part of test
	 * @throws IOException
	 */
	void testL2L() throws IOException{
	BufferedReader Out = new BufferedReader (new FileReader ("Target2.txt"));			 //read template file, template file was edited to fix incorrect special character

	BufferedReader In = new BufferedReader (new FileReader ("out_seed20.txt"));          //read generated file

	String expectedLine;	
	while ((expectedLine = In.readLine ()) != null) {

	               String actualLine = Out.readLine ();

				assertEquals (expectedLine, actualLine);								 //test code of equal
 
	 }
	Out.close();
	In.close();
	}
	 
}
